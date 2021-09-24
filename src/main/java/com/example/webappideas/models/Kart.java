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


    public Kart() {
    }

    public Kart(long id, int weight, int acceleration, int on_road_traction, int off_road_traction, int mini_turbo, int ground_speed, int water_speed, int anti_g_speed, int air_speed, int ground_handling, int water_handling, int anti_g_handling, int air_handling) {
        this.id = id;
        this.weight = weight;
        this.acceleration = acceleration;
        this.on_road_traction = on_road_traction;
        this.off_road_traction = off_road_traction;
        this.mini_turbo = mini_turbo;
        this.ground_speed = ground_speed;
        this.water_speed = water_speed;
        this.anti_g_speed = anti_g_speed;
        this.air_speed = air_speed;
        this.ground_handling = ground_handling;
        this.water_handling = water_handling;
        this.anti_g_handling = anti_g_handling;
        this.air_handling = air_handling;
    }

    public Kart(int weight, int acceleration, int on_road_traction, int off_road_traction, int mini_turbo, int ground_speed, int water_speed, int anti_g_speed, int air_speed, int ground_handling, int water_handling, int anti_g_handling, int air_handling) {
        this.weight = weight;
        this.acceleration = acceleration;
        this.on_road_traction = on_road_traction;
        this.off_road_traction = off_road_traction;
        this.mini_turbo = mini_turbo;
        this.ground_speed = ground_speed;
        this.water_speed = water_speed;
        this.anti_g_speed = anti_g_speed;
        this.air_speed = air_speed;
        this.ground_handling = ground_handling;
        this.water_handling = water_handling;
        this.anti_g_handling = anti_g_handling;
        this.air_handling = air_handling;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getOn_road_traction() {
        return on_road_traction;
    }

    public void setOn_road_traction(int on_road_traction) {
        this.on_road_traction = on_road_traction;
    }

    public int getOff_road_traction() {
        return off_road_traction;
    }

    public void setOff_road_traction(int off_road_traction) {
        this.off_road_traction = off_road_traction;
    }

    public int getMini_turbo() {
        return mini_turbo;
    }

    public void setMini_turbo(int mini_turbo) {
        this.mini_turbo = mini_turbo;
    }

    public int getGround_speed() {
        return ground_speed;
    }

    public void setGround_speed(int ground_speed) {
        this.ground_speed = ground_speed;
    }

    public int getWater_speed() {
        return water_speed;
    }

    public void setWater_speed(int water_speed) {
        this.water_speed = water_speed;
    }

    public int getAnti_g_speed() {
        return anti_g_speed;
    }

    public void setAnti_g_speed(int anti_g_speed) {
        this.anti_g_speed = anti_g_speed;
    }

    public int getAir_speed() {
        return air_speed;
    }

    public void setAir_speed(int air_speed) {
        this.air_speed = air_speed;
    }

    public int getGround_handling() {
        return ground_handling;
    }

    public void setGround_handling(int ground_handling) {
        this.ground_handling = ground_handling;
    }

    public int getWater_handling() {
        return water_handling;
    }

    public void setWater_handling(int water_handling) {
        this.water_handling = water_handling;
    }

    public int getAnti_g_handling() {
        return anti_g_handling;
    }

    public void setAnti_g_handling(int anti_g_handling) {
        this.anti_g_handling = anti_g_handling;
    }

    public int getAir_handling() {
        return air_handling;
    }

    public void setAir_handling(int air_handling) {
        this.air_handling = air_handling;
    }
}
