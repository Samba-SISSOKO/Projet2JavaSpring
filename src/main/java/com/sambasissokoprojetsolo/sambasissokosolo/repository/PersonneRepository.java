package com.sambasissokoprojetsolo.sambasissokosolo.repository;

import com.sambasissokoprojetsolo.sambasissokosolo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
}
