package com.dtos;

import com.entities.Cours;
import lombok.Data;

import java.io.Serializable;

@Data
public class VacataireDto implements Serializable {

    private final Long id;
    private final String login;
    private final String motDePasse;
    private final String nomUsuel;
    private final String prenom;
    private final String mail;
    private final Cours cours;
}
