package com.dgsspa.marvel.entity;

/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Personaggi")
@Data
public class Personaggi {
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

    public Personaggi(Integer id, String nome, String razza, Date eta, Date dataNascita) {
        this.id = id;
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
        this.dataNascita = dataNascita;
    }

    public Personaggi() {
    }
}