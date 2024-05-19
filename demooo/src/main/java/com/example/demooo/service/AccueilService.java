package com.example.demooo.service;

import com.example.demooo.entity.Accueil;
import com.example.demooo.repository.AccueilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccueilService {

    @Autowired
    private AccueilRepository accueilRepository;

    public List<Accueil> findAll() {
        return accueilRepository.findAll();
    }

    public Accueil save(Accueil accueil) {
        return accueilRepository.save(accueil);
    }

    public Accueil findById(Long id) {
        return accueilRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        accueilRepository.deleteById(id);
    }
}
