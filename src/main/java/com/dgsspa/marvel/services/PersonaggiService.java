package com.dgsspa.marvel.services;

import com.dgsspa.marvel.entity.Abilita;
import com.dgsspa.marvel.repository.PersonaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonaggiService{

    @Autowired
    private PersonaggiRepository personaggiRepository;

    public Set<String> findByNome(String nome){
        return personaggiRepository.findByNome(nome);
    }

    public Set<String> countAllFilm(){ return personaggiRepository.countAllFilm(); }

}
