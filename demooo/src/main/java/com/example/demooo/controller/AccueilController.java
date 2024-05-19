package com.example.demooo.controller;

import com.example.demooo.entity.Accueil;
import com.example.demooo.service.AccueilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accueils")
public class AccueilController {

    @Autowired
    private AccueilService accueilService;

    @GetMapping
    public List<Accueil> getAllAccueils() {
        return accueilService.findAll();
    }

    @GetMapping("/{id}")
    public Accueil getAccueilById(@PathVariable Long id) {
        return accueilService.findById(id);
    }

    @PostMapping
    public Accueil createAccueil(@RequestBody Accueil accueil) {
        return accueilService.save(accueil);
    }

    @PutMapping("/{id}")
    public Accueil updateAccueil(@PathVariable Long id, @RequestBody Accueil updatedAccueil) {
        Accueil accueil = accueilService.findById(id);
        if (accueil != null) {
            accueil.setSport(updatedAccueil.getSport());
            accueil.setSite(updatedAccueil.getSite());
            accueil.setDate(updatedAccueil.getDate());
            accueil.setMatchId(updatedAccueil.getMatchId());
            return accueilService.save(accueil);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAccueil(@PathVariable Long id) {
        accueilService.deleteById(id);
    }
}

