package com.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Seance_formation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vacataire vacataire;

    @ManyToOne
    private Creneau creneau;

    private boolean estEffectue;
    private long dureeEffective;
    private boolean valide;
    private String commentaire;
}
