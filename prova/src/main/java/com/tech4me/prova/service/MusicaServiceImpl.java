package com.tech4me.prova.service;

import java.util.List;
import java.util.stream.Collectors;

import com.tech4me.prova.model.Musica;
import com.tech4me.prova.repository.MusicaRepository;
import com.tech4me.prova.shared.MusicaDto;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaServiceImpl implements MusicaService{

    @Autowired
    private MusicaRepository repository;

    //ModelMapper mapper = new ModelMapper();
    
    @Override
    public List<MusicaDto> obterTodos() {
        /* List<Musica> musicas = repository.findAll();
        List<MusicaDto> musicaDtos = musicas.stream()
        .map(p -> mapper.map(p, MusicaDto.class))
        .collect(Collectors.toList());
        return musicaDtos; */
        return null;
    } 
    
}
