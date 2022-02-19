package com.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Data
public class Creneau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cours cours;

    @Enumerated(EnumType.STRING)
    private Type type;

    private LocalDateTime beginDate;
    private Long duree;

}