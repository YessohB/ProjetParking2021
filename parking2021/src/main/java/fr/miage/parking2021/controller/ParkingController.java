package fr.miage.parking2021.controller;

import fr.miage.parking2021.metier.Parking;
import fr.miage.parking2021.repository.ParkingRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingRepository parkingRepository;
    private Parking parking;

    @GetMapping("/parkings")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Parking> ListParking(){
        return parkingRepository.findAll();
    }




    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Parkings/{id}
    @GetMapping(value ="/parking/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    @CrossOrigin(origins = "http://localhost:4200")
    public Parking afficherUnParking(@PathVariable Integer numParking, String nomParking, Integer taille, Integer prix, String description, Integer numCommune){

        Parking parking = new Parking(numParking, nomParking,taille,prix,description,numCommune );

        return parking;

        //Normalement ici dans le corp de la méthode on va chercher dans la base de données
    }

    @PostMapping(value ="/parking")

    public void ajouterParking(@RequestBody Parking parking){

        parkingRepository.save(parking);

    }




}
