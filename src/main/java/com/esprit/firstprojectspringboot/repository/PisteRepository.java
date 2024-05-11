package com.esprit.firstprojectspringboot.repository;

import com.esprit.firstprojectspringboot.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
