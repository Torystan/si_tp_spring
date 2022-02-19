package com.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Filiere_langue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Composante composante;

    private String code;
    private String nom;
}