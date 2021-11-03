package com.tech4me.prova.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.tech4me.prova.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
