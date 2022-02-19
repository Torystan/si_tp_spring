package com.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String motDePasse;
    private String nomUsuel;
    private String prenom;
    private String mail;

}