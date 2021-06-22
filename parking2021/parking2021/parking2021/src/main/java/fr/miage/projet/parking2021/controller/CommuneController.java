package fr.miage.projet.parking2021.controller;

import fr.miage.projet.parking2021.metier.Commune;
import fr.miage.projet.parking2021.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/commune")
public class CommuneController {

    @Autowired
    CommuneService communeService;

    @GetMapping("")
    public List<Commune> list() {
        return communeService.listAllCommune();
    }

    @GetMapping("/{numcommune")
    public ResponseEntity<Commune> get(@PathVariable Integer id) {
        try {
            Commune commune = communeService.getCommune(id);
            return new ResponseEntity<Commune>(commune, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Commune>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Commune commune) {
        communeService.saveCommune(commune);
    }

    @PutMapping("/{numcommune}")
    public ResponseEntity<?> update(@RequestBody Commune commune, @PathVariable Integer id) {
        try {
            Commune existCommune = communeService.getCommune(id);
            commune.setNumCommune(id);
            communeService.saveCommune(commune);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
