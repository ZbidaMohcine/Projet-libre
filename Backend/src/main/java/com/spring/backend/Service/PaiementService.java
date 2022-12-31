package com.spring.backend.Service;

import com.spring.backend.Entity.Paiement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PaiementService {
    public  Paiement create(Paiement paiemen);
    public List<Paiement> gets();
    public Paiement updatePaiement(Long id,Paiement paiement);
    public void deletePayment(Long id);
    public Optional<Paiement> getPaiement(Long id);
}
