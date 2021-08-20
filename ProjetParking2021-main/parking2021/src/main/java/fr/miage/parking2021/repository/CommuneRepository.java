package fr.miage.parking2021.repository;

import fr.miage.parking2021.metier.Commune;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommuneRepository extends JpaRepository<Commune, Integer> {

    @Modifying
    @Query("UPDATE Commune c SET c.numCommune= ?1, c.nomCommune= ?2, c.codePostal= ?3")
    void updateCommune(Commune commune);

    public List<Commune> findAll(); // methode permettant de retourner tous les parkings



    public  Commune save(Commune commune) ;//methode classique de sauvegarde permettant d'ajouter ou de mettre à jour un parking

    @Override
    void deleteById(Integer integer);


}

