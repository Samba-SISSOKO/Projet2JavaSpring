package com.sambasissokoprojetsolo.sambasissokosolo;

import com.sambasissokoprojetsolo.sambasissokosolo.model.Personne;
import com.sambasissokoprojetsolo.sambasissokosolo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SambasissokosoloApplication implements CommandLineRunner {
	@Autowired
	PersonneRepository repos;


	public static void main(String[] args) {
		SpringApplication.run(SambasissokosoloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}