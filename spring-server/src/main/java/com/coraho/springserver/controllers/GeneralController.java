package com.coraho.springserver.controllers;

import com.coraho.springserver.entities.GeneralObj;
import com.coraho.springserver.services.GeneralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/obj")
@CrossOrigin("http://localhost:3000")
public class GeneralController {

    private final GeneralService generalService;

    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping()
    public ResponseEntity<?> getObj() {
        return ResponseEntity.status(HttpStatus.OK).body(generalService.getAllObj());
    }

    @PostMapping()
    public ResponseEntity<?> createObj(@RequestBody GeneralObj obj) {
        GeneralObj createdObj = generalService.createObj(obj);
        return createdObj == null ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cannot create this object, please try again.") :
                ResponseEntity.status(HttpStatus.CREATED).body(createdObj);
    }
}
