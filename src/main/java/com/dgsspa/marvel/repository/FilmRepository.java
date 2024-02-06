package com.dgsspa.marvel.repository;

import com.dgsspa.marvel.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(
        value = "SELECT p.Nome AS NomePersonaggio FROM personaggi p JOIN pfilm pf ON p.id = pf.id_personaggi JOIN film f ON f.id = pf.id_film WHERE f.Nome = (:nomeFilm)",
            nativeQuery = true)
    Set<String> findByNomeFilm(@Param("nomeFilm") String nomeFilm);

    List<Film> findByNome(String nome);

    /*@Query(value = "SELECT a.Abilita  FROM personaggi p JOIN abilita a ON p.id = a.EroeID WHERE p.Nome = (:nome)",
            nativeQuery = true)
    Set<String> findByNome(@Param("nome")String nome);*/

}
