package com.dgsspa.marvel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "film")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "regista")
    private String regista;

    @Column(name = "data_uscita")
    private Date dataUscita;

   /* @ManyToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pfilm",
            joinColumns = { @JoinColumn(name = "id_film") },
            inverseJoinColumns = { @JoinColumn(name = "id_personaggi") }
    )
    List<Film> films = new ArrayList<>();*/

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pfilm",
            joinColumns = {@JoinColumn(name = "id_film")},
            inverseJoinColumns = {@JoinColumn(name = "id_personaggi")}
    )
    private List<Personaggi> personaggi = new ArrayList<>();

}