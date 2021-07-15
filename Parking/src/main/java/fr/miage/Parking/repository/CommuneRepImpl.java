package fr.miage.Parking.repository;

import fr.miage.Parking.metier.Commune;

import java.util.List;

public abstract class CommuneRepImpl implements CommuneRepository {

    CommuneRepository communeRepository;

    List<Commune> commune;
    @Override
    public List<Commune> findAll() {

        return commune;
    }


    @Override
    public Commune findById(int numcommune) {
        for (Commune commune : commune) {
            if(commune.getNumCommune() == numcommune){
                return commune;
            }
        }
        return null;
    }

    @Override
    public Commune save(Commune commune) {
        commune.add(commune);
        return commune;
    }



}
