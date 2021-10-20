package com.tiagoperroni.kubernetes.controller;

import java.util.List;

import com.tiagoperroni.kubernetes.model.model.FrasesModel;
import com.tiagoperroni.kubernetes.services.FrasesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FrasesController {

    @Autowired
    private FrasesService frasesService;

    @GetMapping
    public ResponseEntity<List<FrasesModel>> getAllFrases() {
        return new ResponseEntity<>(frasesService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FrasesModel> create(@RequestBody FrasesModel frases) {
        return new ResponseEntity<>(frasesService.create(frases), HttpStatus.CREATED);
    }

    @GetMapping("/funny")
    public ResponseEntity<FrasesModel> getFrase() {
        return new ResponseEntity<>(frasesService.getFrase(), HttpStatus.OK);
    }
}
