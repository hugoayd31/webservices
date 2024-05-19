package com.example.demooo.repository;

import com.example.demooo.entity.Accueil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccueilRepository extends JpaRepository<Accueil, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire

}
