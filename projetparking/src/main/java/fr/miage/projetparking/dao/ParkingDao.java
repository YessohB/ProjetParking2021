package fr.miage.projetparking.dao;

//Pour récupérer les parking dans la base de données on retourne pas directement la classe Parking mais on appelle plutôt la couche d'accès aux données
//Il faut alors créer la DAO :

import fr.miage.projetparking.model.Parking;

import java.util.List;

public interface ParkingDao {

    public List<Parking> findAll(); //methode permettant de retourner tous les parking

    public Parking findById(int id); //methode permettant de trouver un parking par rapport à son id

    public Parking save(Parking parking); //methode classique de sauvegarde permettant d'ajouter ou de mettre à jour un parking

}
