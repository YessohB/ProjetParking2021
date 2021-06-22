package fr.miage.projet.parking2021.controller;

import fr.miage.projet.parking2021.metier.Parking;
import fr.miage.projet.parking2021.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    ParkingService parkingService;

    @GetMapping("")
    public List<Parking> list() {
        return parkingService.listAllParking();
    }

}
