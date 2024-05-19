package com.example.demooo.controller;


import com.example.demooo.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportController {

    public final SportService sportService;

    @Autowired
    public SportController(SportService sportService) {
        this.sportService = sportService;
}


}