package com.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Responsable extends Utilisateur {

    @ManyToOne
    private Composante composante;
}
