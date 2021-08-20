package fr.miage.parking2021.repository;

import fr.miage.parking2021.metier.Commune;



import java.util.List;

public abstract class CommuneRepImpl implements CommuneRepository {

    CommuneRepository communeRepository;

    List<Commune> commune;
    @Override
    public List<Commune> findAll() {

        return commune;
    }

/*
    @Override
    public Commune findById(Integer numCommune) {
        for (Commune commune : commune) {
            if(commune.getNumCommune() == numCommune){
                return commune;
            }
        }
        return null;
    }*/

    @Override
    public Commune save(Commune commune) {
        commune.add(commune);
        return commune;
    }


}
