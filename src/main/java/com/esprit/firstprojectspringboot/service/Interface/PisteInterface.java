package com.esprit.firstprojectspringboot.service.Interface;

import com.esprit.firstprojectspringboot.entities.Piste;

import java.util.List;

public interface PisteInterface {

    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
