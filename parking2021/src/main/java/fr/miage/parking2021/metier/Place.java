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

    public Place(){

    }

    public Place(Integer numPlace, String typePlace, String libelle, Integer occupation) {
        this.numPlace = numPlace;
        this.typePlace = typePlace;
        this.libelle = libelle;
        this.occupation = occupation;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return occupation == place.occupation &&
                Objects.equals(numPlace, place.numPlace) &&
                Objects.equals(typePlace, place.typePlace) &&
                Objects.equals(libelle, place.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPlace, typePlace, libelle, occupation);
        
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Place{");
        sb.append("numPlace=").append(numPlace);
        sb.append(", typePlace='").append(typePlace).append('\'');
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", occupation=").append(occupation);
        sb.append('}');
        return sb.toString();
    }

    public void add(Place place) {
    }
}
