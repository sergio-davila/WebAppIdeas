package com.example.webappideas.models;

import javax.persistence.*;


@Entity
@Table(name="karts")
public class Kart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int weight;

    @Column(nullable = false)
    private int acceleration;

    @Column(nullable = false)
    private int on_road_traction;

    @Column(nullable = false)
    private int off_road_traction;

    @Column(nullable = false)
    private int mini_turbo;

    @Column(nullable = false)
    private int ground_speed;

    @Column(nullable = false)
    private int water_speed;

    @Column(nullable = false)
    private int anti_g_speed;

    @Column(nullable = false)
    private int air_speed;

    @Column(nullable = false)
    private int ground_handling;

    @Column(nullable = false)
    private int water_handling;

    @Column(nullable = false)
    private int anti_g_handling;

    @Column(nullable = false)
    private int air_handling;



}
