package com.coraho.springserver.controllers;

import com.coraho.springserver.services.GeneralService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/obj")
public class GeneralController {

    private final GeneralService generalService;

    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping()
    public ResponseEntity<?> getObj() {
        return ResponseEntity.ok().body(generalService.getAllObj());
    }
}
