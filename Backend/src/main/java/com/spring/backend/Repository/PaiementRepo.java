package com.spring.backend.Repository;

import com.spring.backend.Entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepo extends JpaRepository<Paiement,Long> {
}
