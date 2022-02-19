package com.dtos;

import com.entities.Filiere_langue;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CoursDto implements Serializable {
    private final Long id;
    private final List<Filiere_langueDto> filieres;
    private final String intitule;
}
