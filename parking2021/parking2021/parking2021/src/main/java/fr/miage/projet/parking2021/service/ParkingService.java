package fr.miage.projet.parking2021.service;

import fr.miage.projet.parking2021.metier.Parking;
import fr.miage.projet.parking2021.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    public List<Parking> listAllParking() {
        return parkingRepository.findAll();
    }

    public Parking getParking(Integer numParking) {
        return parkingRepository.findById(numParking).get();
    }

    public void saveParking(Parking parking) {
        parkingRepository.save(parking);
    }

    public void deleteParking(Integer numParking) {
        parkingRepository.deleteById(numParking);
    }

}
