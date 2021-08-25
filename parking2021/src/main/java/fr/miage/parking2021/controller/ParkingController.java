package fr.miage.parking2021.controller;

import fr.miage.parking2021.metier.Parking;
import fr.miage.parking2021.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingRepository parkingRepository;
    private Parking parking;

    //Methode pour avoir la liste des parkings
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


    }
    //Méthode pour sauvegarder un parking
    @PostMapping(value ="/parking")
    public String ajouterParking(@RequestBody Parking parking){

        parkingRepository.save(parking);
        return "redirect:index.html"; }
    //Méthode pour supprimer un parking
    @DeleteMapping("/parking/{id}")
    ResponseEntity<?> deleteParking(@PathVariable Integer id) {
        parkingRepository.deleteById(id);
        return ResponseEntity.noContent().build(); }
    //Méthode pour mettre a jour un parking
    @PutMapping("/parking/{id}")
    public void updateParking(@RequestBody Parking parking){parkingRepository.updateParking(parking);}

    @GetMapping("/parkings/commune")//methode pour selectionner les parkings par commnune
    @CrossOrigin(origins = "http://localhost:4200")
            public List<Parking> listParkingByIdCommune(@RequestParam Integer numCommune){
        return parkingRepository.findByIdCommune(numCommune);
    }

}
