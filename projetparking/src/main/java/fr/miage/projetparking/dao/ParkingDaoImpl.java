package fr.miage.projetparking.dao;

import fr.miage.projetparking.model.Parking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ParkingDaoImpl implements ParkingDao{

    //Pas de base de données donc mise en place d'objets statiques

    public static List<Parking> parkings = new ArrayList<>();

    static {
        parkings.add(new Parking(1, new String("Parking du bois"), 5));
        parkings.add(new Parking(2, new String("Parking du soleil"), 2));
        parkings.add(new Parking(3, new String("Parking de la nuit"), 10));
    }

    @Override
    public List<Parking> findAll() {
        return parkings;
    }

    @Override
    public Parking findById(int id) {
        for (Parking parking : parkings) {
            if (parking.getId() == id){
                return parking;
            }
        }
        return null;
    }

    @Override
    public Parking save(Parking parking) {
        parkings.add(parking);
        return parking;
    }
}
