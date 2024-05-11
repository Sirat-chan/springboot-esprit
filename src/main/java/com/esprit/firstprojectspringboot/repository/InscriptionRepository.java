package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {


}
