package fr.miage.projet.parking2021.service;

import fr.miage.projet.parking2021.metier.Place;
import fr.miage.projet.parking2021.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public List<Place> listAllPlace() {
        return placeRepository.findAll();
    }

    public Place getPlace(Integer id) {
        return placeRepository.findById(id).get();
    }

    public void savePlace(Place place) {
        placeRepository.save(place);
    }

    public void deletePlace(Integer id) {
        placeRepository.deleteById(id);
    }
}
