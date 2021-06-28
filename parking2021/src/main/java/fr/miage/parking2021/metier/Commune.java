package fr.miage.parking2021.metier;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "commune")
public class Commune {


    @Id
    @GeneratedValue
    @Column(name = "numcommune")
    private Integer numCommune;

    @Column(name = "nomcommune")
    private String nomCommune ="";

    @Column(name = "codepostal")
    private String codePostal;

    public Commune(){ }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commune commune = (Commune) o;
        return numCommune == commune.numCommune &&
                Objects.equals(nomCommune, commune.nomCommune) &&
                Objects.equals(codePostal, commune.codePostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCommune, nomCommune, codePostal);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Commune{");
        sb.append("numCommune=").append(numCommune);
        sb.append(", nomCommune='").append(nomCommune).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void add(Commune commune) {
    }
}

