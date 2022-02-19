package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class GestionnaireDto implements Serializable {
    private final Long id;
    private final String login;
    private final String motDePasse;
    private final String nomUsuel;
    private final String prenom;
    private final String mail;
}
