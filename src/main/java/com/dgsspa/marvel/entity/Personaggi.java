package com.dgsspa.marvel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.persistence.*;*/

import java.lang.annotation.Annotation;
import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "personaggi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personaggi{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "razza")
    private String razza;

    @Column(name = "eta")
    private Integer eta;

    @Column(name = "data_nascita")
    private Date dataNascita;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="eroe_id")
    private List<Abilita> eroeId = new ArrayList<>();

    @ManyToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pfilm",
            joinColumns = { @JoinColumn(name = "id_film") },
            inverseJoinColumns = { @JoinColumn(name = "id_personaggi") }
    )
    List<Film> films = new ArrayList<>();

}