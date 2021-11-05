package com.tech4me.prova.view.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.tech4me.prova.service.MusicaService;
import com.tech4me.prova.shared.MusicaDto;
import com.tech4me.prova.view.model.MusicaRequest;
import com.tech4me.prova.view.model.MusicaResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {

    @Autowired
    private MusicaService service;

    private ModelMapper mapper = new ModelMapper();

    @GetMapping
    private ResponseEntity<List<MusicaResponse>> obterTodos(){
        List<MusicaDto> musicaDto = service.obterTodos();
        List<MusicaResponse> musicaResponses = musicaDto.
        stream().
        map(m -> mapper.map(m, MusicaResponse.class)).
        collect(Collectors.toList());
        return new ResponseEntity<>(musicaResponses,HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<MusicaResponse> criarMusica(@RequestBody @Valid MusicaRequest musicaRequest){
        MusicaDto musicaDto = mapper.map(musicaRequest, MusicaDto.class);
        musicaDto = service.adicionarMuica(musicaDto);
        MusicaResponse musicaResponse = mapper.map(musicaDto, MusicaResponse.class);
        return new ResponseEntity<>(musicaResponse,HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value="/{id}")
    private ResponseEntity<String> removerMusica(@PathVariable String id){
        service.removerMusica(id);
        return new ResponseEntity<>("Removida com sucesso",HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    private ResponseEntity<MusicaResponse> alterarMusica(@PathVariable String id, @RequestBody @Valid MusicaRequest musicarRequest) {
        MusicaDto musicaDto = mapper.map(musicarRequest, MusicaDto.class);
        musicaDto = service.adicionarMuica(musicaDto);
        MusicaResponse musicaResponse = mapper.map(musicaDto, MusicaResponse.class);
        return new ResponseEntity<>(musicaResponse,HttpStatus.OK);
    }
    
    
}
