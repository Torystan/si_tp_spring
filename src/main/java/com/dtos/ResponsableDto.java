package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponsableDto {
    private Long id;
    private String login;
    private String motDePasse;
    private String nomUsuel;
    private String prenom;
    private String mail;
    private ComposanteDto composante;
}
