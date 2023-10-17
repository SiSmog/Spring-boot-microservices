package com.example.projet;

import com.example.projet.dao.EnseignantChercheurDao;
import com.example.projet.dao.MembreDao;
import com.example.projet.entities.Etudiant;
import com.example.projet.entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProjetApplication  {

    @Autowired
    MembreDao membreDao;

    public static void main(String[] args) {
        SpringApplication.run(ProjetApplication.class, args);
    }


}
