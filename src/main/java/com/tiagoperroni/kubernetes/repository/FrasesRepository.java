package com.tiagoperroni.kubernetes.repository;

import com.tiagoperroni.kubernetes.model.model.FrasesModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrasesRepository extends JpaRepository<FrasesModel, Integer>{
    
}
