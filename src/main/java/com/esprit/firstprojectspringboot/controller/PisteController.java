package com.esprit.firstprojectspringboot.controller;


import com.esprit.firstprojectspringboot.entities.Piste;
import com.esprit.firstprojectspringboot.service.Interface.CoursInterface;
import com.esprit.firstprojectspringboot.service.Interface.PisteInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piste")
@AllArgsConstructor
public class PisteController {

    private final PisteInterface pisteInterface;

    @GetMapping("/listpiste")
    public List<Piste> retrieveAllPistes(@RequestBody Piste piste) {
        return pisteInterface.retrieveAllPistes();
    }


    @PostMapping("/addpiste")
    public Piste addPiste(Piste piste) {
        return pisteInterface.addPiste(piste);
    }

    public Piste updatePiste(Piste piste) {
        return pisteInterface.updatePiste(piste);
    }

    @GetMapping("/getPiste/{id}")
    public Piste retrievePiste(@PathVariable Long numPiste) {
        return pisteInterface.retrievePiste(numPiste);
    }
}
