package com.example.demooo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Entity
@Setter
@Table(name = "sport")
@RedisHash("Sport")
@Data

public class Sport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sport;

    @Column(name = "name")
    private String sport_name;

    public Sport() {
    }

    public Sport(String sport_name) {
        this.sport_name = sport_name;
    }

}