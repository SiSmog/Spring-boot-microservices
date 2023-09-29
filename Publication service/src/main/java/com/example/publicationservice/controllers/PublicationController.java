package com.example.publicationservice.controllers;

import com.example.publicationservice.entities.Publication;
import com.example.publicationservice.services.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationController {
    @Autowired
    PublicationService publicationService;
    @PostMapping
    public void addOutil(@RequestBody Publication outil){
        publicationService.addOutil(outil);
    }
}
