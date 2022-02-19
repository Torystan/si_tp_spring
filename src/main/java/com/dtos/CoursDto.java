package com.dtos;

import com.entities.Filiere_langue;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CoursDto {
    private Long id;
    private List<Filiere_langueDto> filieres;
    private String intitule;
}
