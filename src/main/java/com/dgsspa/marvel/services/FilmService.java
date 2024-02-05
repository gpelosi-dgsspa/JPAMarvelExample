package com.dgsspa.marvel.services;

import com.dgsspa.marvel.repository.FilmRepository;
import com.dgsspa.marvel.repository.PersonaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public Set<String> findByNomeFilm(String nomeFilm){
        return filmRepository.findByNomeFilm(nomeFilm);
    }

}
