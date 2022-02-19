package com.dtos;

import com.dtos.CoursDto;
import com.entities.Type;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CreneauDto implements Serializable {
    private final Long id;
    private final CoursDto cours;
    private final Type type;
    private final LocalDateTime beginDate;
    private final Long duree;
}
