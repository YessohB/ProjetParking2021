package fr.miage.parking2021.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/") //methode pour charger le ficher index.html au démarrage de l'application, l'index fait office de partie admin
    public String index() {
        return "redirect:index.html";
    }
}
