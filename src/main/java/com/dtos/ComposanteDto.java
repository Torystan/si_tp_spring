package com.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class ComposanteDto implements Serializable {
    private final Long id;
    private final String nom;
}
