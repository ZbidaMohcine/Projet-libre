package com.spring.backend.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@Table(name = "eleve")
public class Eleve {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nom;
    private String Prenom;
    private Date DateNaissance;
    private String Cne;
    private String Adress;
    private String emailParent1;
    private String emailParent2;
    private long TelParent1;
    private long TelParent2;

   @JsonBackReference
    @ManyToOne
    @JoinColumn(name="id_class", nullable=false)
    private Class aClass ;
    @JsonManagedReference
    @OneToMany(mappedBy = "eleve")
    private List<Paiement> payments;

}
