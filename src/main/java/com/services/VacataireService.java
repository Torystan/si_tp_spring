package com.services;

import com.dtos.VacataireDto;

import java.util.List;

public interface VacataireService {
    /**
     * Ajouter un vacataire
     */
    VacataireDto saveVacataire(VacataireDto vacataireDto);

    /**
     * Obtenir un vacataire par son id
     */
    VacataireDto getVacataireById(Long vacataireId);

    /**
     * Supprimer un vacataire par son id
     */
    boolean deleteVacataire(Long vacataireId);

    /**
     * Obtenir tous les vacataires
     */
    List<VacataireDto> getAllVacataires();
}
