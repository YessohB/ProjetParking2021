package fr.miage.parking2021;

import fr.miage.parking2021.metier.Parking;
import fr.miage.parking2021.metier.Place;
import fr.miage.parking2021.repository.ParkingRepository;
import fr.miage.parking2021.repository.PlaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication

public class Parking2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Parking2021Application.class, args);
    }

    @Bean
    CommandLineRunner init( ParkingRepository parkingRepository){
        return args -> {
            Stream.of().forEach(numparking -> {
                Parking parking = new Parking();
                parkingRepository.save(parking);
            });
            parkingRepository.findAll().forEach(System.out::println);
        }; 
    }





}
