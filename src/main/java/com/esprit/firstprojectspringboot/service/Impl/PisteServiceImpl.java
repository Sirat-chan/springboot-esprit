package com.esprit.firstprojectspringboot.service.Impl;

import com.esprit.firstprojectspringboot.entities.Piste;
import com.esprit.firstprojectspringboot.repository.PisteRepository;
import com.esprit.firstprojectspringboot.service.Interface.PisteInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class PisteServiceImpl implements PisteInterface {
    private final PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}
