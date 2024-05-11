package com.esprit.firstprojectspringboot.entities;


import com.esprit.firstprojectspringboot.entities.enums.Couleur;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "piste")
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    @ManyToMany(mappedBy = "pisteList")
    private List<Skieur> skieurList;
}
