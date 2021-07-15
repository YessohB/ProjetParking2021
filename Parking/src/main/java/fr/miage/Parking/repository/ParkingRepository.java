package fr.miage.Parking.repository;

import fr.miage.Parking.metier.Parking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {
    //permet d'avoir des méthodes prédéfinies

    public List<Parking> findAll(); //methode permettant de retourner tous les parking

    public Parking findById(int numparking); //methode permettant de trouver un parking par rapport à son id

    public Parking save(Parking parking); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour un parking
}
