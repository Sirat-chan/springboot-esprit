package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
