package com.example.projet.services;

import com.example.projet.dao.MembreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projet.entities.Membre;
@Service
public class MembreService {
    @Autowired
    MembreDao membreDao;
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
}
