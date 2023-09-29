package com.example.evenementservice.controllers;


import com.example.evenementservice.entities.Evenement;
import com.example.evenementservice.services.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutilController {
    @Autowired
    EvenementService evenementService;
    @PostMapping
    public void addOutil(@RequestBody Evenement evenement){
        evenementService.addEvenement(evenement);
    }
}
