package fr.miage.parking2021.metier;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name = "parking")
public class Parking {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "numparking")
    private Integer numParking ;

    @Column(name = "nomparking")
    private String nomParking = "";

    @Column(name = "taille")
    private Integer taille;

    @Column(name = "prix")
    private Integer prix;

    @Column(name = "description")
    private String description = "";

    @Column(name = "numcommune")
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
        final StringBuffer sb = new StringBuffer("Parking{");
        sb.append("numParking=").append(numParking);
        sb.append(", nomParking='").append(nomParking).append('\'');
        sb.append(", taille=").append(taille);
        sb.append(", prix=").append(prix);
        sb.append(", description='").append(description).append('\'');
        sb.append(", numCommune=").append(numCommune);
        sb.append('}');
        return sb.toString();
    }
}

