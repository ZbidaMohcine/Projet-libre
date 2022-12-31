package com.spring.backend.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data @RequiredArgsConstructor
@Table(name = "class")
public class Class {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String niveau;
    private String libelle;
    @JsonManagedReference
    @OneToMany(mappedBy = "aClass")
    private Set<Eleve> eleves =new HashSet<>();
    @OneToOne
    @JoinColumn (name = "id_tarif")
    private Tarif tariff;

}
