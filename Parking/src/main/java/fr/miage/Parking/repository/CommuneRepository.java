package fr.miage.Parking.repository;

import fr.miage.Parking.metier.Commune;
import fr.miage.Parking.metier.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommuneRepository extends JpaRepository<Commune, Integer> {

    public List<Commune> findAll(); // methode permettant de retourner tous les parkings

    public Commune findById(int numcommune); //methode permettant de trouver une commune par rapport à son id

    public Commune save(Commune commune); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour un parking

}
