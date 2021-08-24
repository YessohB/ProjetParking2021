package fr.miage.parking2021.metier;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "commune")
public class Commune {


    @Id
    @Column(name = "numcommune",insertable=true, updatable=true, nullable=false )
    private Integer numCommune;

    @Column(name = "nomcommune",insertable=true, updatable=true, nullable=false)
    private String nomCommune ="";

    @Column(name = "codepostal",insertable=true, updatable=true, nullable=false)
    private String codePostal;



    public Commune(){
        super();
    }

    public Commune(Integer numCommune, String nomCommune, String codePostal) {
        this.numCommune = numCommune;
        this.nomCommune = nomCommune;
        this.codePostal = codePostal;
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



    public void delete(Commune commune) {}

    public void update(Commune commune){}

    public void save(Commune commune){}


    @Override
    public String toString() {
        return "Commune{" +
                "numCommune=" + numCommune +
                ", nomCommune='" + nomCommune + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }

    public void add(Commune commune) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commune)) return false;
        Commune commune = (Commune) o;
        return Objects.equals(getNumCommune(), commune.getNumCommune()) &&
                Objects.equals(getNomCommune(), commune.getNomCommune()) &&
                Objects.equals(getCodePostal(), commune.getCodePostal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumCommune(), getNomCommune(), getCodePostal());
    }

}

