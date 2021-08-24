package fr.miage.parking2021.repository;


import fr.miage.parking2021.metier.Place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    public List<Place> findAll(); //methode permettant de retourner toutes les places

    public Place findById(int numplace); //methode permettant de trouver une place par rapport à son id

    public Place save(Place place); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour une place


    void deleteById(Integer integer); //methode de suppression de place par l'id

    @Modifying
    @Query("UPDATE Place l SET l.numPlace = ?1, l.typePlace= ?2, l.libelle =?3, l.occupation =?4, l.numParking = ?5 ")
    void updatePlace(Place place);

    @Query("SELECT p FROM Place p WHERE p.numParking= ?1")

    public List<Place> findByIdParking(Integer numParking);

}
