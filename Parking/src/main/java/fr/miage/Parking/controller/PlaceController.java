package fr.miage.Parking.controller;

import fr.miage.Parking.metier.Commune;
import fr.miage.Parking.metier.Place;
import fr.miage.Parking.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Place")
public class PlaceController  {

    @Autowired
    private PlaceRepository placeRepository;
    private Place place;

    @GetMapping("/Places")
    public List<Place> ListPlace(){return placeRepository.findAll();}

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Places/{id}
    @GetMapping(value ="/places/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    public Place afficherUnePlace(@PathVariable Integer numPlace, String typePlace, String libelle, Integer occupation){

        Place place = new Place(numPlace, typePlace, libelle, occupation);

        return  place;
    }

    @PostMapping(value = "/Places")
    public  void ajouterPlace(@RequestBody Place place){
        placeRepository.save(place);
    }

}
