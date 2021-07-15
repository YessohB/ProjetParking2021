package fr.miage.Parking.controller;

import fr.miage.Parking.metier.Commune;
import fr.miage.Parking.metier.Parking;
import fr.miage.Parking.repository.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commune")
public class CommuneController {

    @Autowired
    private CommuneRepository communeRepository;
    private Commune commune;


    @GetMapping("/Communes")
    public List<Commune> ListCommune(){return communeRepository.findAll();}

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Communes/{id}
    @GetMapping(value ="/communes/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    public Commune afficherUneCommune(@PathVariable Integer numCommune, String nomCommune, String codePostal){

        Commune commune = new Commune(numCommune, nomCommune, codePostal);

        return  commune;
    }

    @PostMapping(value = "/Communes")
    public  void ajouterCommune(@RequestBody Commune commune){
        communeRepository.save(commune);
    }

}
