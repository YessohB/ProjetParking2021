package fr.miage.projet.parking2021.service;

import fr.miage.projet.parking2021.metier.Commune;
import fr.miage.projet.parking2021.repository.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommuneService {

    @Autowired
    private CommuneRepository communeRepository;

    public List<Commune> listAllCommune() {
        return communeRepository.findAll();
    }

    public Commune getCommune(Integer numcommune) {
        return communeRepository.findById(numcommune).get();
    }

    public void saveCommune(Commune commune) {
        communeRepository.save(commune);
    }

    public void deleteCommune(Integer numcommune) {
        communeRepository.deleteById(numcommune);
    }
}
