package fr.miage.parking2021.metier;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name = "parking")
public class Parking {
    @Id
    @Column(name = "numparking",insertable=true, updatable=true, nullable=false)
    private Integer numParking ;

    @Column(name = "nomparking",insertable=true, updatable=true, nullable=false)
    private String nomParking = "";

    @Column(name = "taille",insertable=true, updatable=true, nullable=false)
    private Integer taille;

    @Column(name = "prix",insertable=true, updatable=true, nullable=false)
    private Integer prix;

    @Column(name = "description",insertable=true, updatable=true, nullable=false)
    private String description = "";

    @Column(name = "numcommune",insertable=true, updatable=true, nullable=false)
    private Integer numCommune;


    public Parking(){

    }

    public Parking(Integer numParking, String nomParking, Integer taille, Integer prix, String description, Integer numCommune) {
        this.numParking = numParking;
        this.nomParking = nomParking;
        this.taille = taille;
        this.prix = prix;
        this.description = description;
        this.numCommune = numCommune;
    }

    public int getNumParking() {
        return numParking;
    }

    public void setNumParking(int numParking) {
        this.numParking = numParking;
    }

    public String getNomParking() { return nomParking; }

    public void setNomParking(String nomParking) {
        this.nomParking = nomParking;
    }


    public int getTaille() {
        return taille;
    }

    public void setTaille(int codePostal) {
        this.taille = codePostal;
    }



    public void setPrix(int  prix) {
        this.prix = prix;
    }

    public int getPrix() { return prix; }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getNumCommune() {
        return numCommune;
    }

    public void setNumCommune(int numCommune) {
        this.numCommune = numCommune;
    }


    public void add(Parking parking) {
    }

    public void save(Parking parking){}

    public void delete(Integer integer) {}

    public void update(Parking parking) {}


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parking parking = (Parking) o;
        return numParking == parking.numParking &&
                taille == parking.taille &&
                prix == parking.prix &&
                numCommune == parking.numCommune &&
                nomParking.equals(parking.nomParking) &&
                description.equals(parking.description);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "numParking=" + numParking +
                ", nomParking='" + nomParking + '\'' +
                ", taille=" + taille +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", numCommune=" + numCommune +
                '}';
    }
}

