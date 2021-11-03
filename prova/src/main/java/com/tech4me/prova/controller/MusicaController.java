package com.tech4me.prova.controller;

import java.util.List;

import com.tech4me.prova.service.MusicaService;
import com.tech4me.prova.shared.MusicaDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {

    @Autowired
    private MusicaService service;

    @GetMapping
    private ResponseEntity<List<MusicaDto>> obterTodos(){
        
        return new ResponseEntity<>(service.obterTodos(),HttpStatus.OK);

    }
    
}
