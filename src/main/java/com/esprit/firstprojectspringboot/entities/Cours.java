package com.esprit.firstprojectspringboot.entities;


import com.esprit.firstprojectspringboot.entities.enums.Suppport;
import com.esprit.firstprojectspringboot.entities.enums.TypeCours;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "cours")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numCours;
    private Integer niveau;
    private TypeCours typeCours;
    private Suppport suppport;
    private Float prix;
    private Integer creneau;

    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptionList;



}
