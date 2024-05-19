package com.example.demooo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}

