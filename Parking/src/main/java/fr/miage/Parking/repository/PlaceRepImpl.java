package fr.miage.Parking.repository;

import fr.miage.Parking.metier.Place;

import java.util.List;

public abstract class PlaceRepImpl implements  PlaceRepository {


    List<Place> place;
    @Override
    public List<Place> findAll() {

        return place;
    }


    @Override
    public Place findById(int numplace) {
        for (Place place : place) {
            if(place.getNumPlace() ==numplace){
                return place;
            }
        }
        return null;
    }

    @Override
    public Place save(Place place) {
        place.add(place);
        return place;
    }

}
