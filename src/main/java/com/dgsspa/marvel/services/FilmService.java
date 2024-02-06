package com.dgsspa.marvel.services;

import com.dgsspa.marvel.JpaMarvelExampleApplication;
import com.dgsspa.marvel.entity.Film;
import com.dgsspa.marvel.entity.Personaggi;
import com.dgsspa.marvel.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class FilmService {


    private static final Logger log = LoggerFactory.getLogger(FilmService.class);
    @Autowired
    private FilmRepository filmRepository;

    public Set<String> findByNomeFilm(String nomeFilm){
        return filmRepository.findByNomeFilm(nomeFilm);
    }

    public List<Personaggi> findPersonaggiByTitoloFilm(String titoloFilm) {
        List<Film> filmList = filmRepository.findByNome(titoloFilm);
        if (!filmList.isEmpty()) {
            Film film = filmList.get(0); // Prendi il primo film se ce ne sono più di uno con lo stesso titolo
            return film.getPersonaggi();
        } else {
            return new ArrayList<>(); // Nessun film trovato con il titolo specificato
        }
    }

    public void stampaPersonaggiByTitoloFilm(String titoloFilm) {
        List<Personaggi> personaggi = findPersonaggiByTitoloFilm(titoloFilm);

        if (!personaggi.isEmpty()) {
            log.info("Personaggi nel film '" + titoloFilm + "':");
            for (Personaggi personaggio : personaggi) {
                log.info(" - " + personaggio.getNome()); //Stampo il nome del personaggio
            }
        } else {
            log.info("Nessun personaggio trovato per il film '" + titoloFilm + "'");
        }
    }

    /*public List<Film> findByNome(String nome){
        return filmRepository.findByNome(nome);
    }*/

}
