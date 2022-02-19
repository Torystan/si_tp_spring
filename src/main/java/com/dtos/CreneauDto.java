package com.dtos;

import com.dtos.CoursDto;
import com.entities.Type;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CreneauDto {
    private Long id;
    private CoursDto cours;
    private Type type;
    private LocalDateTime beginDate;
    private Long duree;
}
