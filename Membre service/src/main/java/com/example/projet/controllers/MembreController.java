package com.example.projet.controllers;

import com.example.projet.entities.EnseignantChercheur;
import com.example.projet.entities.Etudiant;
import com.example.projet.entities.Membre;
import com.example.projet.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembreController {
    @Autowired
    MembreService membreService;
    @PostMapping("/etudiant")
    public void addMembre(@RequestBody Etudiant etudiant){
        membreService.addMember(etudiant);
    }
    @PostMapping("/enseignant")
    public void addMember(@RequestBody EnseignantChercheur enseignantChercheur){
        membreService.addMember(enseignantChercheur);
    }
}
