package com.example.webappideas.controllers;

import com.example.webappideas.DAOs.GliderRepository;
import com.example.webappideas.DAOs.KartRepository;
import com.example.webappideas.DAOs.RacerRepository;
import com.example.webappideas.DAOs.TireRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KartBuilderController {

    private final KartRepository kartDao;
    private final RacerRepository racerDao;
    private final TireRepository tireDao;
    private final GliderRepository gliderDao;

    public KartBuilderController(KartRepository kartDao, RacerRepository racerDao, TireRepository tireDao, GliderRepository gliderDao) {
        this.kartDao = kartDao;
        this.racerDao = racerDao;
        this.tireDao = tireDao;
        this.gliderDao = gliderDao;
    }

    @GetMapping("/")
    public String kartBuilder(Model model, @RequestParam(name = "racerMenu", required = false) String racer_id, @RequestParam(name = "kartMenu", required = false) String kart_id, @RequestParam(name = "tireMenu", required = false) String tire_id, @RequestParam(name = "gliderMenu", required = false) String glider_id) {
        model.addAttribute("racers",racerDao.findAll());
        model.addAttribute("kartBodies", kartDao.findAll());
        model.addAttribute("tires", tireDao.findAll());
        model.addAttribute("gliders", gliderDao.findAll());



        return "KartBuilder/kartbuilder";
    }
}
