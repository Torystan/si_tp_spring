package com.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Entity
@Data
public class Cours {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Filiere_langue> filieres = new ArrayList<>();

    private String intitule;
}
