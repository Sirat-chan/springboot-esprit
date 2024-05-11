package com.esprit.firstprojectspringboot.service.Interface;

import com.esprit.firstprojectspringboot.entities.Cours;

import java.util.List;

public interface CoursInterface {

    List retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
