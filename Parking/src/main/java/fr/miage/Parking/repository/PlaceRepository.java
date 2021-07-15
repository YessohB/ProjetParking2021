package fr.miage.Parking.repository;

import fr.miage.Parking.metier.Place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    public List<Place> findAll(); //methode permettant de retourner toutes les places

    public Place findById(int numplace); //methode permettant de trouver une place par rapport à son id

    public Place save(Place place); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour une place


}