package com.example.projet.services;

import com.example.projet.dao.EnseignantChercheurDao;
import com.example.projet.dao.EtudiantDao;
import com.example.projet.dao.MembreDao;
import com.example.projet.entities.EnseignantChercheur;
import com.example.projet.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projet.entities.Membre;

import java.util.List;

@Service
public class MembreService {
    @Autowired
    MembreDao membreDao;
    @Autowired
    EtudiantDao etudiantDao;
    @Autowired
    EnseignantChercheurDao enseignantChercheurDao;

    public List<Membre>findAll(){
        return membreDao.findAll();
    }
    public Membre addMember(Membre m) {
        membreDao.save(m);
        return m;
    }
    public void deleteMember(Long id) {
        membreDao.deleteById(id);
    }
    public Membre updateMember(Membre m) {
        return membreDao.saveAndFlush(m);
    }
    public Membre findMember(Long id) {
        Membre m = (Membre) membreDao.findById(id).get();
        return m;
    }
    public Membre findByCin(String cin){
        return membreDao.findByCin(cin);
    }
    public Membre findByEmail(String email){
        return  membreDao.findByEmail(email);
    }
    public List<Membre> findByNom(String nom){
        return membreDao.findByNom(nom);
    }
    public List<Etudiant> findByDiplome(String diplome){
        return etudiantDao.findByDiplome(diplome);
    }
    public List<EnseignantChercheur> findByGrade(String grade){
        return enseignantChercheurDao.findByGrade(grade);
    }
    public List<EnseignantChercheur> findByEtablissement(String etablissement){
        return enseignantChercheurDao.findByEtablissement(etablissement);
    }
    public void affecterEtudiant(Long etudiantId,Long enseignantId){
        Etudiant etudiant=(Etudiant) membreDao.findById(etudiantId).get();
        EnseignantChercheur enseignantChercheur =(EnseignantChercheur) membreDao.findById(enseignantId).get();
        etudiant.setEncadrant(enseignantChercheur);
        membreDao.save(etudiant);
    }
}
