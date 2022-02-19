package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Seance_formationDto implements Serializable {
    private final Long id;
    private final VacataireDto vacataire;
    private final CreneauDto creneau;
    private final boolean estEffectue;
    private final long dureeEffective;
    private final boolean valide;
    private final String commentaire;
}
