package com.spring.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tarifs")
@Data @RequiredArgsConstructor
public class Tarif {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "niveau")
    private String niveau;

    @Column(name = "montant")
    private BigDecimal montant;
    @ManyToOne
    @JoinColumn(name = "id_class")
    private Class tClass;
    @OneToOne(mappedBy = "tariff")
    private Class classe;
}

