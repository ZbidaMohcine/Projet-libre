package com.spring.backend.Repository;

import com.spring.backend.Entity.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepo extends JpaRepository<Eleve,Long> {
}
