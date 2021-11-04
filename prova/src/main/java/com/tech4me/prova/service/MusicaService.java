package com.tech4me.prova.service;

import java.util.List;

import com.tech4me.prova.shared.MusicaDto;

public interface MusicaService {
    List<MusicaDto>obterTodos();
    MusicaDto adicionarMuica(MusicaDto musicaDto);
    void removerMusica(String id);
    MusicaDto alterarMusica(String id, MusicaDto musicaDto);
}
