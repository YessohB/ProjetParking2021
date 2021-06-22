package fr.miage.projet.parking2021.metier;

import javax.persistence.*;

@Entity
@Table(name = "commune")
public class Commune {

    @Id
    @GeneratedValue
    @Column(name = "numcommune")
    private int numCommune;

    @Column(name = "nomcommune")
    private String nomCommune ="";

    @Column(name = "codepostal")
    private String codePostal;

    public Commune(){

    }

    public int getNumCommune() {
        return numCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setNumCommune(int numCommune) {
        this.numCommune = numCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
