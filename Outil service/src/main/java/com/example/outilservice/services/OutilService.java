package com.example.outilservice.services;

import com.example.outilservice.dao.OutilDao;
import com.example.outilservice.entities.Outil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OutilService {
    @Autowired
    OutilDao outilDao;
    public Outil addOutil(Outil outil) {
        outilDao.save(outil);
        return outil;
    }
    public void deleteOutil(Long id){
        outilDao.deleteById(id);
    }
    public void updateOutil(Outil outil){
        Outil oldOutil=outilDao.findById(outil.getId()).orElse(null);
        if (oldOutil!=null){
            //to do
        }

    }
}
