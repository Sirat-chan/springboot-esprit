package com.esprit.firstprojectspringboot.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "inscription")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numInscription;
    private Integer numSemaine;

    @ManyToOne
    @JoinColumn(name = "skieur_id")
    private Skieur skieur;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;


}
