package com.coraho.springserver.repositories;

import com.coraho.springserver.entities.GeneralObj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralRepo extends JpaRepository<GeneralObj, Long> {
}
