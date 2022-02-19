package com.repositories;

import com.entities.Seance_formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Seance_formationRepository extends JpaRepository<Seance_formation, Long> {
}