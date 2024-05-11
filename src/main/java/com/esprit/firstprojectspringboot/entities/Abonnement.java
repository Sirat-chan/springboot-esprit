package com.esprit.firstprojectspringboot.entities;


import com.esprit.firstprojectspringboot.entities.enums.TypeAbonnement;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "abonnement")
public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    private TypeAbonnement typeAbon;


}
