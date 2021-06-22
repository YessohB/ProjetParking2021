package fr.miage.projet.parking2021.repository;

import fr.miage.projet.parking2021.metier.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Integer> {
}
