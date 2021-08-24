package fr.miage.parking2021.controller;


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

    @GetMapping("/places")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Place> ListPlace(){return placeRepository.findAll();}

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Places/{id}
    @GetMapping(value ="/place/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    @CrossOrigin(origins = "http://localhost:4200")
    public Place afficherUnePlace(@PathVariable Integer numPlace, String typePlace, String libelle, Integer occupation, Integer numParking){

        Place place = new Place(numPlace, typePlace, libelle, occupation, numParking);

        return  place;
    }

    @PostMapping(value = "/place")
    public String ajouterPlace(@RequestBody Place place){

        placeRepository.save(place);
        return "redirect:PlaceView.html";
    }

    @DeleteMapping("/place/{id}")
    ResponseEntity<?> deletePlace(@PathVariable Integer id) {

        placeRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/place/{id}")
    public String updatePlace(@RequestBody Place place){
        placeRepository.updatePlace(place);
        return "redirect:PlaceView.html";

    }

    @GetMapping("/places/parking")
    @CrossOrigin(origins = "http://localhost:4200")
            public List<Place> listPlaceByIdParking(@RequestParam Integer numParking){
        return placeRepository.findByIdParking(numParking);
    }

}
