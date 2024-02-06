package com.dgsspa.marvel.services;

import com.dgsspa.marvel.entity.Personaggi;
import com.dgsspa.marvel.repository.PersonaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PersonaggiService{

    @Autowired
    private PersonaggiRepository personaggiRepository;

    public Set<String> findByNomePersonale(String nome){
        return personaggiRepository.findByNomePersonale(nome);
    }

    public Personaggi findByNome(String nome){
        return personaggiRepository.findByNome(nome);
    };

    public Set<String> countAllFilm(){ return personaggiRepository.countAllFilm(); }

}
