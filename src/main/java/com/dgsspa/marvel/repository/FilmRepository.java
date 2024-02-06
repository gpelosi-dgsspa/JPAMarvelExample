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

    List<Film> findByNome(String nome);

}
