package fr.miage.parking2021.controller;


import fr.miage.parking2021.metier.Commune;
import fr.miage.parking2021.repository.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommuneController {

    @Autowired
    private CommuneRepository communeRepository;
    private Commune commune;


    @GetMapping("/communes")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Commune> ListCommune(){return communeRepository.findAll();}

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Communes/{id}
    @GetMapping(value ="/commune/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    @CrossOrigin(origins = "http://localhost:4200")
    public Commune afficherUneCommune(@PathVariable Integer numCommune, String nomCommune, String codePostal){

        Commune commune = new Commune(numCommune, nomCommune, codePostal);

        return  commune;
    }

    @PostMapping(value = "/commune")
    public  void ajouterCommune(@RequestBody Commune commune){

        communeRepository.save(commune);

    }

    @DeleteMapping("/commune/{id}")
    ResponseEntity<?> deleteCommune(@PathVariable Integer id) {

        communeRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/commune/{id}")
    public void updateCommune(@RequestBody Commune commune){
        communeRepository.updateCommune(commune);

    }

/*
    @PutMapping("/commune/{id}")
    public ResponseEntity<Commune> updateCommune(@PathVariable(value = "numCommune") Integer numCommune,
                                                    @RequestBody Commune communeDetail) throws ResourceNotFoundException {
        Commune commune = communeRepository.findById(numCommune);


        commune.setNumCommune(communeDetail.getNumCommune());
        commune.setNomCommune(communeDetail.getNomCommune());
        commune.setCodePostal(communeDetail.getCodePostal());
        final Commune updateCommune = communeRepository.save(commune);
        return ResponseEntity.ok(updateCommune);
    }*/
}
