package fr.miage.projetparking.model;

public class Parking {

    private int id;
    private String nom;
    private int prix;

    //Constructeur par défaut -> utiliser pour Postman
    public Parking(){
    }

    //Constructor
    public Parking(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    //Serialisation
    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
