package com.example.demooo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {

    @Autowired
    private SiteRepository siteRepository;

    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    public Site save(Site site) {
        return siteRepository.save(site);
    }

    public Site findById(Long id) {
        return siteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        siteRepository.deleteById(id);
    }

    // Méthodes de service pour les recherches personnalisées si nécessaire
    public List<Site> findByName(String name) {
        return siteRepository.findByName(name);
    }

    public List<Site> findByLocation(String location) {
        return siteRepository.findByLocation(location);
    }
}

