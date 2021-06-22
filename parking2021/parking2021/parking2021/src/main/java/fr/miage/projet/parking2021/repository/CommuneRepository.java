package fr.miage.projet.parking2021.repository;

import fr.miage.projet.parking2021.metier.Commune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommuneRepository extends JpaRepository<Commune, Integer> {
}
