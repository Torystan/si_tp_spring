package com.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Vacataire extends Utilisateur {

    @ManyToOne
    private Cours cours;
}
