package fr.miage.projet.parking2021.repository;

import fr.miage.projet.parking2021.metier.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
