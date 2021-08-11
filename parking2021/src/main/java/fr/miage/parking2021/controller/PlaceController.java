package fr.miage.parking2021.controller;


import fr.miage.parking2021.metier.Commune;
import fr.miage.parking2021.metier.Place;
import fr.miage.parking2021.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaceController  {

    @Autowired
    private PlaceRepository placeRepository;
    private Place place;

    @GetMapping("/Places")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Place> ListPlace(){return placeRepository.findAll();}

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Places/{id}
    @GetMapping(value ="/place/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    @CrossOrigin(origins = "http://localhost:4200")
    public Place afficherUnePlace(@PathVariable Integer numPlace, String typePlace, String libelle, Integer occupation){

        Place place = new Place(numPlace, typePlace, libelle, occupation);

        return  place;
    }

    @PostMapping(value = "/Place")
    public  void ajouterPlace(@RequestBody Place place){
        placeRepository.save(place);
    }

    @DeleteMapping("/place/{id}")
    ResponseEntity<?> deletePlace(@PathVariable Integer id) {

        placeRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
