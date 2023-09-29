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
public class ProjetApplication implements CommandLineRunner {

    @Autowired
    MembreDao membreDao;

    public static void main(String[] args) {
        SpringApplication.run(ProjetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etudiant etd1 = Etudiant.builder()
                .cin("123456")
                .dateInscription(new Date())
                .dateNaissance(new Date())
                .diplome("mastère")
                .email("etd1@gmail.com")
                .password("pass1")
                .cv("cv1")
                .nom("abid")
                .prenom("youssef")
                .sujet("blockchain")
                .build();

        membreDao.save(etd1);
    }
}
