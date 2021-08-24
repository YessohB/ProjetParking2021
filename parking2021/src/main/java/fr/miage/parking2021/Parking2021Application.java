package fr.miage.parking2021;

import fr.miage.parking2021.metier.Commune;
import fr.miage.parking2021.metier.Parking;
import fr.miage.parking2021.metier.Place;
import fr.miage.parking2021.repository.CommuneRepository;
import fr.miage.parking2021.repository.ParkingRepository;
import fr.miage.parking2021.repository.PlaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.*;

import java.util.stream.Stream;

@SpringBootApplication

public class Parking2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Parking2021Application.class, args);
    }



    @Bean // Permet d'initialiser les repository afin de voir l'état de la base de données ainsi que les derniers id attribuer
    CommandLineRunner init(ParkingRepository parkingRepository, PlaceRepository placeRepository, CommuneRepository communeRepository){
        return args -> {
            Stream.of().forEach(numparking -> {
                Parking parking = new Parking();
                parkingRepository.save(parking);
            });
            Stream.of().forEach(numcommune -> {
                Commune commune = new Commune();
                communeRepository.save(commune);
            });
            Stream.of().forEach(numplace ->{
                Place place = new Place();
                placeRepository.save(place);
            });
            parkingRepository.findAll().forEach(System.out::println);
            communeRepository.findAll().forEach(System.out::println);
            placeRepository.findAll().forEach(System.out::println);
        }; 
    }

}



