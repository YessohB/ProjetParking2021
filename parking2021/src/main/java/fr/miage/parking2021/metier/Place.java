package fr.miage.parking2021.metier;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @Column(name = "numplace")
    private Integer numPlace;

    @Column(name = "typeplace")
    private String typePlace ="";

    @Column(name = "libelle")
    private String libelle ="";

    @Column(name = "occupation")
    private Integer occupation;

    @Column(name ="numparking")
    private  Integer numParking;

    public Place(){

    }

    public Place(Integer numPlace, String typePlace, String libelle, Integer occupation, Integer numParking) {
        this.numPlace = numPlace;
        this.typePlace = typePlace;
        this.libelle = libelle;
        this.occupation = occupation;
        this.numParking = numParking;
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

    public void setOccupation(Integer occupation) { this.occupation = occupation; }

    public Integer getNumParking() { return numParking; }

    public void setNumParking(Integer numParking) { this.numParking = numParking; }

    public void add(Place place) {
    }

    public void save(Place place) {

    }

    public void delete(Integer integer) {

    }

    public void update(Place place) {

    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;
        Place place = (Place) o;
        return Objects.equals(getNumPlace(), place.getNumPlace()) &&
                Objects.equals(getTypePlace(), place.getTypePlace()) &&
                Objects.equals(getLibelle(), place.getLibelle()) &&
                Objects.equals(getOccupation(), place.getOccupation()) &&
                Objects.equals(getNumParking(), place.getNumParking());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumPlace(), getTypePlace(), getLibelle(), getOccupation(), getNumParking());
    }

    @Override
    public String toString() {
        return "Place{" +
                "numPlace=" + numPlace +
                ", typePlace='" + typePlace + '\'' +
                ", libelle='" + libelle + '\'' +
                ", occupation=" + occupation +
                ", numParking=" + numParking +
                '}';
    }
}
