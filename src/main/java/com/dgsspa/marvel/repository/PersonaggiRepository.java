package com.dgsspa.marvel.repository;


import com.dgsspa.marvel.entity.Abilita;
import com.dgsspa.marvel.entity.Personaggi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PersonaggiRepository extends JpaRepository<Personaggi, Integer> {

    @Query(value = "SELECT a.Abilita  FROM personaggi p JOIN abilita a ON p.id = a.EroeID WHERE p.Nome = (:nome)",
        nativeQuery = true)
    Set<String> findByNome(@Param("nome")String nome);

}
