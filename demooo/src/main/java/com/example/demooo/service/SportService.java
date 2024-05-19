package com.example.demooo.service;


import com.example.demooo.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService {
    private final SportRepository sportRepository;

    @Autowired
    public SportService(SportRepository sportRepository){
        this.sportRepository = sportRepository;
}
}