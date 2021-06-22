package fr.miage.projet.parking2021.controller;

import fr.miage.projet.parking2021.metier.Parking;
import fr.miage.projet.parking2021.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
    public ResponseEntity<Parking> get(@PathVariable Integer id) {
        try {
            Parking parking = parkingService.getParking(id);
            return new ResponseEntity<Parking>(parking, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Parking>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Parking parking) {
        parkingService.saveParking(parking);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@RequestBody Parking parking, @PathVariable Integer id) {
        try {
            Parking existParking = parkingService.getParking(id);
            parking.setNumParking(id);
            parkingService.saveParking(parking);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        parkingService.deleteParking(id);
    }
}
