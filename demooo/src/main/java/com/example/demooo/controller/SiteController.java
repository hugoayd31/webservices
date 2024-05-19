package com.example.demooo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sites")
public class SiteController {

    @Autowired
    private SiteService siteService;

    @GetMapping
    public List<Site> getAllSites() {
        return siteService.findAll();
    }

    @GetMapping("/{id}")
    public Site getSiteById(@PathVariable Long id) {
        return siteService.findById(id);
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteService.save(site);
    }

    @PutMapping("/{id}")
    public Site updateSite(@PathVariable Long id, @RequestBody Site updatedSite) {
        Site site = siteService.findById(id);
        if (site != null) {
            site.setName(updatedSite.getName());
            site.setLocation(updatedSite.getLocation());
            return siteService.save(site);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteSite(@PathVariable Long id) {
        siteService.deleteById(id);
    }

    // Endpoints pour les recherches personnalisées
    @GetMapping("/name/{name}")
    public List<Site> getSitesByName(@PathVariable String name) {
        return siteService.findByName(name);
    }

    @GetMapping("/location/{location}")
    public List<Site> getSitesByLocation(@PathVariable String location) {
        return siteService.findByLocation(location);
    }
}

