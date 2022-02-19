package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Seance_formationDto {
    private Long id;
    private VacataireDto vacataire;
    private CreneauDto creneau;
    private boolean estEffectue;
    private long dureeEffective;
    private boolean valide;
    private String commentaire;
}
