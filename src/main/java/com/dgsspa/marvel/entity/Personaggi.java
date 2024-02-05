package com.dgsspa.marvel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.persistence.*;*/

import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Personaggi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personaggi{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Razza")
    private String razza;

    @Column(name = "Eta")
    private Date eta;

    @Column(name = "DataNascita")
    private Date dataNascita;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="EroeID")
    private Set<Abilita> skills = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "pfilm",
            joinColumns = { @JoinColumn(name = "id_film") },
            inverseJoinColumns = { @JoinColumn(name = "id_personaggi") }
    )
    Set<Film> films = new HashSet<>();

}