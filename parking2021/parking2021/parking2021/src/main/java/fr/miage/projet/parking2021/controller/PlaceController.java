package fr.miage.projet.parking2021.controller;

import fr.miage.projet.parking2021.metier.Place;
import fr.miage.projet.parking2021.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @GetMapping("")
    public List<Place> list() {
        return placeService.listAllPlace();
    }

    @GetMapping("/{numplace}")
    public ResponseEntity<Place> get(@PathVariable Integer numplace) {
        try {
            Place place = placeService.getPlace(numplace);
            return new ResponseEntity<Place>(place, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Place>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Place place) {
        placeService.savePlace(place);
    }

    @PutMapping("/{numplace")
    public ResponseEntity<?> update(@RequestBody Place place, @PathVariable Integer numplace) {
        try {
            Place existPlace = placeService.getPlace(numplace);
            place.setNumPlace(numplace);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/numplace")
    public void delete(@PathVariable Integer numplace) {
        placeService.deletePlace(numplace);
    }
}
