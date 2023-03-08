package com.sambasissokoprojetsolo.sambasissokosolo.controller;

import com.sambasissokoprojetsolo.sambasissokosolo.model.Personne;
import com.sambasissokoprojetsolo.sambasissokosolo.repository.PersonneRepository;
import com.sambasissokoprojetsolo.sambasissokosolo.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonneController {

    @Autowired
    PersonneService service;

    @GetMapping("/personne")
    Iterable<Personne> getPersonnes(){
        return  service.getPersonne();
    }


    @GetMapping("/personne/{id}")
    public Optional<Personne> personneById(@PathVariable int id){
        return service.getPersonneById(id);
    }

    @DeleteMapping("/delete")
    public void SuprimerPersonne(@PathVariable Personne p){
        service.deletePersonne(p);
    }

    @PostMapping("/nouvoPersonne")
    Personne savePersonne(Personne personne){
        Personne p = service.savePersonne(personne);
        return p;
    }


}
