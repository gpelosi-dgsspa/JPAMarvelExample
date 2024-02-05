package com.dgsspa.marvel.repository;


import com.dgsspa.marvel.entity.Abilita;
import com.dgsspa.marvel.entity.Personaggi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonaggiRepository extends JpaRepository<Personaggi, Integer> {

    @Query(value = "SELECT a.Abilita  FROM personaggi p JOIN abilita a ON p.id = a.EroeID WHERE p.Nome = (:nome)",
        nativeQuery = true)
    Set<String> findByNome(@Param("nome")String nome);

    @Query(value = "SELECT p.Nome AS NomePersonaggio, COUNT(pf.id_film) AS Apparizioni FROM personaggi p JOIN pfilm pf ON p.id = pf.id_personaggi GROUP BY p.Nome ORDER BY Apparizioni DESC",
    nativeQuery = true)
    Set<String> countAllFilm();

}
