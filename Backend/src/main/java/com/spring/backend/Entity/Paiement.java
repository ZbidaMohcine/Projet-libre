package com.spring.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@RequiredArgsConstructor
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dateDePaiment;
    private boolean paid;
    @JsonBackReference
    @ManyToOne
   @JoinColumn(name="id_eleve", nullable=false)
   private Eleve eleve;
    @ManyToOne
    @JoinColumn(name="id_echaence", nullable=false)
    private Echeance echeance  ;
}
