package fr.miage.projet.parking2021.metier;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue
    @Column(name = "numplace")
    private int numPlace;

    @Column(name = "typeplace")
    private String typePlace ="";

    @Column(name = "libelle")
    private String libelle ="";

    @Column(name = "occupation")
    private int occupation;

    public Place(){

    }

    public int getNumPlace() {
        return numPlace;
    }

    public void setNumPlace(int numPlace) {
        this.numPlace = numPlace;
    }

    public String getTypePlace() {
        return typePlace;
    }

    public void setTypePlace(String typePlace) {
        this.typePlace = typePlace;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }
}
