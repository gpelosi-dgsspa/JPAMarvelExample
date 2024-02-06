package com.dgsspa.marvel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*import javax.persistence.*;*/
import java.util.Date;

@Entity/*
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)*/
@Table(name = "abilita")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Abilita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "abilita")
    private String abilita;

    @Column(name = "potenza")
    private String potenza;

    /*@ManyToOne
    @JoinColumn(name = "eroe_id")
    private Personaggi personaggi;*/
}