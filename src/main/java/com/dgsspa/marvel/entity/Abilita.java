package com.dgsspa.marvel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.persistence.*;*/
import java.util.Date;

@Entity/*
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)*/
@Table(name = "Abilita")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Abilita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Abilita")
    private String abilita;

    @Column(name = "Potenza")
    private String Potenza;

    @ManyToOne
    @JoinColumn(name = "EroeID")
    private Personaggi personaggi;
}