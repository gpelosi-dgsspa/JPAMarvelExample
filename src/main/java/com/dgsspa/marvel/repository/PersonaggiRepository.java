package com.dgsspa.marvel.repository;


import com.dgsspa.marvel.entity.Personaggi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface PersonaggiRepository extends JpaRepository<Personaggi, Integer> {

    Personaggi findByNome(String nome);

    @Query(value = "SELECT p.nome AS NomePersonaggio, COUNT(pf.id_film) AS Apparizioni FROM personaggi p JOIN pfilm pf ON p.id = pf.id_personaggi GROUP BY p.nome ORDER BY Apparizioni DESC",
    nativeQuery = true)
    Set<String> countAllFilm();



}
