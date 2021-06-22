package fr.miage.projet.parking2021.metier;
import javax.persistence.*;

@Entity
@Table(name = "parking")
public class Parking {
    @Id
    @GeneratedValue
    @Column(name = "numparking")
    private int numParking;

    @Column(name = "nomparking")
    private String nomParking = "";

    @Column(name = "taille")
    private int taille;

    @Column(name = "prix")
    private int prix;

    @Column(name = "description")
    private String description = "";

    @Column(name = "numcommune")
    private int numCommune;


    public Parking(){

    }

    public int getNumParking() {
        return numParking;
    }

    public void setNumParking(int numParking) {
        this.numParking = numParking;
    }

    public String getNomParking() {
        return nomParking;
    }

    public void setNomParking(String nomParking) {
        this.nomParking = nomParking;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int codePostal) {
        this.taille = codePostal;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int  prix) {
        this.prix = prix;
    }

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
}
