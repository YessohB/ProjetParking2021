package fr.miage.projet.parking2021.dao;

import fr.miage.projet.parking2021.metier.Parking;

import java.util.List;

public interface ParkingDAO {
    Parking findByName(String nom);
    void saveOrUpdate(Parking parking);
    Parking get(int id);
    List<Parking> findAll();
}
