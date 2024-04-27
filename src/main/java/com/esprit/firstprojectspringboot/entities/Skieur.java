package com.esprit.firstprojectspringboot.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@ToString
@Table(name = "skieur")
public class Skieur {

    @ToString.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

    @ManyToMany
    private List<Piste> pisteList;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptionList;

}
