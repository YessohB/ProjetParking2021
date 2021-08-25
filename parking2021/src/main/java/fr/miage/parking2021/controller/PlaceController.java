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

    @GetMapping("/places")//methode de génération liste de places
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

    @PostMapping(value = "/place")//methode d'ajout de place
    public String ajouterPlace(@RequestBody Place place){

        placeRepository.save(place);
        return "redirect:index.html";
    }

    @DeleteMapping("/place/{id}")//methode suppression place par l'id
    ResponseEntity<?> deletePlace(@PathVariable Integer id) {

        placeRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/place/{id}")//methode de mise à jour de l'entité
    public String updatePlace(@RequestBody Place place){
        placeRepository.updatePlace(place);
        return "redirect:index.html";

    }

    @GetMapping("/places/parking")//methode de selection de recupération d'une place accocier a un  parking
    @CrossOrigin(origins = "http://localhost:4200")
            public List<Place> listPlaceByIdParking(@RequestParam Integer numParking){
        return placeRepository.findByIdParking(numParking);
    }
//---------------------------Methodes pour implémenter les compteurs ----------
    @GetMapping("/places/occupation")//methode de selection des places par les occupations
    @CrossOrigin(origins = "http://localhost:4200")
        public List<Place> listPlaceByIdOccupation(@RequestParam Integer occupation){
        return placeRepository.findByOccupation(occupation);
    }

    @GetMapping("/places/type")//methode de selection des places par le type
    @CrossOrigin(origins = "http://localhost:4200")
        public List<Place> LilstPlaceType(@RequestParam String typePlace){
        return placeRepository.findByTypePlace(typePlace);
    }

    @GetMapping("/places/occupationType")//methode de selection des places par leur occupation et type
    @CrossOrigin(origins = "http://localhost:4200")
        public List<Place> listPlaceByIdOccupationAndType(@RequestParam Integer occupation, String typePlace){
        return placeRepository.findByOccupationAndType(occupation,typePlace);
    }

}
