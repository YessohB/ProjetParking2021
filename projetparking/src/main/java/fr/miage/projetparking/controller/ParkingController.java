package fr.miage.projetparking.controller;

//controller va répondre aux URI appelé
//C’est dans ce controller que l’on met toutes les méthodes qui répondent aux URI de notre micro service.

import fr.miage.projetparking.dao.ParkingDao;
import fr.miage.projetparking.model.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //afin d'indiquer à Spring que c'est ici que l'on met nos méthodes il faut utiliser l'annotation @RestController

public class ParkingController {

    @Autowired  //indiquer que nous avons une couche d'accès aux données qu'il devra instancier automatiquement
    private ParkingDao parkingDao;

    //Méthode qui renvoie la liste de tous les parking
    //Parkings -> URI
    @GetMapping(value = "Parkings")
    public List<Parking> listeParkings(){
        return parkingDao.findAll();
    }

    //Méthode qui va répondre à cette URI -> permet d'aller chercher un produit par son id
    //Parkings/{id}
    @GetMapping(value ="Parkings/{id}") //cela signifie que cette méthode est appelé uniquement si on reçoit une requête de type GET et on indique l'uri
    public Parking afficherUnParking(@PathVariable int id){

        return parkingDao.findById(id);

        //Normalement ici dans le corp de la méthode on va chercher dans la base de données
    }

    @PostMapping(value = "/Parkings")
    public void ajouterParking(@RequestBody Parking parking){

        parkingDao.save(parking);

    }

}
