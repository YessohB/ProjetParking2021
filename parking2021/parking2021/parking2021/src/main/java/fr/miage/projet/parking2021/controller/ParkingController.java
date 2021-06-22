package fr.miage.projet.parking2021.controller;

import fr.miage.projet.parking2021.metier.Parking;
import fr.miage.projet.parking2021.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    ParkingService parkingService;

    @GetMapping("")
    public List<Parking> list() {
        return parkingService.listAllParking();
    }

    @GetMapping("/{numparking}")
    public ResponseEntity<Parking> get(@PathVariable Integer numparking) {
        try {
            Parking parking = parkingService.getParking(numparking);
            return new ResponseEntity<Parking>(parking, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Parking>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Parking parking) {
        parkingService.saveParking(parking);
    }

    @PutMapping("/{numparking}")
    public ResponseEntity<?> update(@RequestBody Parking parking, @PathVariable Integer numparking) {
        try {
            Parking existParking = parkingService.getParking(numparking);
            parking.setNumParking(numparking);
            parkingService.saveParking(parking);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{numparking}")
    public void delete(@PathVariable Integer numparking) {
        parkingService.deleteParking(numparking);
    }
}
