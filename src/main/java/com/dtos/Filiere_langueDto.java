package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Filiere_langueDto {
    private Long id;
    private ComposanteDto composante;
    private String code;
    private String nom;
}
