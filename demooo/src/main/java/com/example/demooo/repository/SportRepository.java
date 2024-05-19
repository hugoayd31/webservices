package com.example.demooo.repository;


import com.example.demooo.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class SportRepository {

        private static final String  HASH_KEY = "Sport" ;
        private RedisTemplate template;


        public Sport save(Sport sport){
                template.opsForHash().put(HASH_KEY, sport.getId_sport(), sport);
                return sport;
        }

        public List<Sport> findAll(){
             return   template.opsForHash().values(HASH_KEY);
        }

        public Sport findSportById( int id){
                return (Sport) template.opsForHash().get(HASH_KEY, id );
        }

        }
