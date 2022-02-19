package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Filiere_langueDto implements Serializable {
    private final Long id;
    private final ComposanteDto composante;
    private final String code;
    private final String nom;
}
