package com.spring.backend.Service.Imp;

import com.spring.backend.Entity.Eleve;
import com.spring.backend.Exception.EleveNotFound;
import com.spring.backend.Repository.EleveRepo;
import com.spring.backend.Service.EleveService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveServiceImpl implements EleveService {
    private EleveRepo eleveRepo;

    public EleveServiceImpl(EleveRepo eleveRepo) {
        this.eleveRepo = eleveRepo;
    }
    @Override
    public Eleve save(Eleve eleve) {
        return eleveRepo.save(eleve);
    }
    @Override
    public List<Eleve> getAll() {
        return eleveRepo.findAll();
    }

    @Override
    public Eleve getOne(Long id) {
            Eleve eleve=eleveRepo.findById(id).orElseThrow();
            return eleve;
    }

    @Override
    public Eleve delete(Long id) {
       Eleve eleve=eleveRepo.findById(id).orElseThrow();
       eleveRepo.delete(eleve);
       return eleve;
    }

    @Override
    public Eleve update(Long id, Eleve eleve) {
        Eleve eleve1=eleveRepo.findById(id).orElseThrow();
        eleve1.setNom(eleve.getNom());
        eleve1.setPrenom(eleve1.getPrenom());
        eleve1.setAdress(eleve.getAdress());
        eleve1.setDateNaissance(eleve.getDateNaissance());
        eleve1.setTelParent1(eleve.getTelParent1());
        eleve1.setEmailParent1(eleve.getEmailParent1());
        eleve1.setTelParent2(eleve.getTelParent2());
        eleve1.setEmailParent2(eleve.getEmailParent2());
       // eleve1.setAClass(eleve.getAClass());
        return eleve1;

    }

    @Override
    public boolean exist(Long id) {
        return eleveRepo.existsById(id);
    }
}
