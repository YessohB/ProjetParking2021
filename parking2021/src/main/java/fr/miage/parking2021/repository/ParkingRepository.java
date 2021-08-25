package fr.miage.parking2021.repository;

import fr.miage.parking2021.metier.Parking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {

    public List<Parking> findAll(); //methode permettant de retourner tous les parking


    public Parking save(Parking parking); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour un parking

    @Override
    void deleteById(Integer integer); // Methode de suppression d'un parking

    @Modifying //Méthode pour mettre à jour un parking
    @Query("UPDATE Parking p SET p.numParking = ?1, p.nomParking= ?2, p.taille= ?3, p.prix =?4, p.description = ?5, p.numCommune = ?6")
    void updateParking(Parking parking);

    @Query("SELECT p FROM Parking p WHERE p.numCommune= ?1") //methode de selection des parkings par commune

    public List<Parking> findByIdCommune(Integer numCommune); //methode de selection d'une commune par son id


}


















