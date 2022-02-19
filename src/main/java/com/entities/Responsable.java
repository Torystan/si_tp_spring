package com.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
public class Responsable extends Utilisateur {

    @ManyToOne
    private Composante composante;
}