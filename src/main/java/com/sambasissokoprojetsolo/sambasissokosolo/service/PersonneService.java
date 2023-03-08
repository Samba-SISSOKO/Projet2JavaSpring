package com.sambasissokoprojetsolo.sambasissokosolo.service;

import com.sambasissokoprojetsolo.sambasissokosolo.model.Personne;
import com.sambasissokoprojetsolo.sambasissokosolo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonneService {

    @Autowired
    PersonneRepository repos;
    public Iterable<Personne> getPersonne(){
        return  repos.findAll();
    }
    public Optional<Personne> getPersonneById(int id){
        return repos.findById(id);
    }

    public Personne savePersonne(Personne personne){
        return repos.save(personne);
    }

    public void deletePersonne(Personne personne){
        repos.delete(personne);
    }


}
