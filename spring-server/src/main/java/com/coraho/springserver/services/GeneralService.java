package com.coraho.springserver.services;

import com.coraho.springserver.entities.GeneralObj;
import com.coraho.springserver.repositories.GeneralRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {

    private final GeneralRepo generalRepo;

    public GeneralService(GeneralRepo generalRepo) {
        this.generalRepo = generalRepo;
    }

    public List<GeneralObj> getAllObj() {
        return generalRepo.findAll();
    }
}
