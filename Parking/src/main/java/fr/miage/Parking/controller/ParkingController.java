package fr.miage.Parking.controller;

import fr.miage.Parking.metier.Parking;
import fr.miage.Parking.repository.ParkingRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingRepository parkingRepository;
    private Parking parking;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/parkings")
    public List<Parking> ListParking(){

        return parkingRepository.findAll();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/parkings-javaconfig").allowedOrigins("http://localhost:8080");
            }
        };
    }

    //@CrossOrigin(origins = "http://localhost:8080")
    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Parkings/{id}
    @GetMapping(value ="/parkings/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    public Parking afficherUnParking(@PathVariable Integer numParking, String nomParking, Integer taille, Integer prix, String description, Integer numCommune){

        Parking parking = new Parking(numParking, nomParking,taille,prix,description,numCommune );

        return parking;

    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value ="/parkings")
    public void ajouterParking(@RequestBody Parking parking){

        parkingRepository.save(parking);

    }


}
