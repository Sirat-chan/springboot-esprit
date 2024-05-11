package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
