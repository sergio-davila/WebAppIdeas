package com.example.webappideas.DAOs;

import com.example.webappideas.models.Racer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RacerRepository extends JpaRepository <Racer, Long>{
}
