package com.esprit.firstprojectspringboot.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "moniteur")
public class Moniteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Cours> coursList;
}
