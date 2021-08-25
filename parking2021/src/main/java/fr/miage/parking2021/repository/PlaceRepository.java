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


    public Place save(Place place); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour une place


    void deleteById(Integer integer); //methode de suppression de place par l'id

    @Modifying
    @Query("UPDATE Place l SET l.numPlace = ?1, l.typePlace= ?2, l.libelle =?3, l.occupation =?4, l.numParking = ?5 ")//methode de mise à jour de l'entite
    void updatePlace(Place place);

    @Query("SELECT p FROM Place p WHERE p.numParking= ?1")//methode de selection de recupération d'une place accocier a un  parking
    public List<Place> findByIdParking(Integer numParking);

    @Query("SELECT p FROM Place p WHERE p.occupation= ?1")//methode de selection des places par les occupations
    public List<Place> findByOccupation(Integer numOccupation);

    @Query("SELECT p FROM Place p WHERE p.typePlace= ?1")//methode de selection des places par le type
    public List<Place> findByTypePlace(String typePlace);

    @Query("SELECT p FROM Place p WHERE p.occupation =?1 and  p.typePlace =?2")//methode de selection des places par leur occupation et type
    public List<Place> findByOccupationAndType(Integer numOccupation,String typePlace);

}
