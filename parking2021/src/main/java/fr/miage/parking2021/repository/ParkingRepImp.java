package fr.miage.parking2021.repository;

import fr.miage.parking2021.metier.Parking;
import  fr.miage.parking2021.controller.ParkingController;
import java.util.List;

public abstract class ParkingRepImp  implements  ParkingRepository {


    ParkingRepository parkingRepository;

    List<Parking> parking;
    @Override
    public List<Parking> findAll() {

        return parking;
    }


    @Override
    public Parking findById(int numparking) {
        for (Parking parking : parking) {
            if(parking.getNumParking() ==numparking){
                return parking;
            }
        }
        return null;
    }

    @Override
    public Parking save(Parking parking) {
        parking.add(parking);
        return parking;
    }




}
