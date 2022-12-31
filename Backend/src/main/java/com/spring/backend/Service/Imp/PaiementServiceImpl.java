package com.spring.backend.Service.Imp;

import com.spring.backend.Entity.Paiement;
import com.spring.backend.Repository.PaiementRepo;
import com.spring.backend.Service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PaiementServiceImpl implements PaiementService {
    @Autowired
    PaiementRepo paiementRepo;
    @Override
    public Paiement create(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public List<Paiement> gets() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement updatePaiement(Long id ,Paiement paiement) {
        Paiement upPaiement=paiementRepo.findById(id).orElse(null);
        upPaiement.setPaid(paiement.isPaid());
        upPaiement.setDateDePaiment(paiement.getDateDePaiment());
        upPaiement.setEleve(paiement.getEleve());
        upPaiement.setEcheance(paiement.getEcheance());
        return upPaiement;
    }

    @Override
    public void deletePayment(Long id) {
        Paiement paiement=paiementRepo.findById(id).orElse(null);
        paiementRepo.delete(paiement);
    }

    @Override
    public Optional<Paiement> getPaiement(Long id) {
        return paiementRepo.findById(id);
    }
}
