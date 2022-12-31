package com.spring.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity @Data @RequiredArgsConstructor
public class Echeance  {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_debut")
    private LocalDate dateDebut;

    @Column(name = "date_limite")
    private LocalDate dateLimite;
    @OneToMany(mappedBy = "echeance")
    private List<Paiement> paiements;

}
