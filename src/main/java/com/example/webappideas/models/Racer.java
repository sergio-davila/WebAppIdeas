package com.example.webappideas.models;

import javax.persistence.*;

@Entity
@Table(name="racers")
public class Racer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
