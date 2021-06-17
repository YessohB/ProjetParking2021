package fr.miage.projet.parking2021.dao;

import fr.miage.projet.parking2021.metier.Place;
import java.util.List;

public interface PlaceDAO {
    Place findByName(String nom);
    void saveOrUpdate(Place place);
    Place get(int id);  
    List<Place> findAll();
}
