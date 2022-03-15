package com.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Composante {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
}
