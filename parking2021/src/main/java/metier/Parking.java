package metier;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Parking {
	private String numParking="";
	private String nomParking = "";
	private int codePostal;
	private int prix;
	private String description = "";
	private int numCommune;

	public Parking() {

	}

	public String getNumParking() {
		return numParking;
	}

	public void setNumParking(String numParking) {
		this.numParking = numParking;
	}

	public String getNomParking() {
		return nomParking;
	}

	public void setNomParking(String nomParking) {
		this.nomParking = nomParking;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
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
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codePostal;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((nomParking == null) ? 0 : nomParking.hashCode());
		result = prime * result + numCommune;
		result = prime * result + ((numParking == null) ? 0 : numParking.hashCode());
		result = prime * result + prix;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		if (codePostal != other.codePostal)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (nomParking == null) {
			if (other.nomParking != null)
				return false;
		} else if (!nomParking.equals(other.nomParking))
			return false;
		if (numCommune != other.numCommune)
			return false;
		if (numParking == null) {
			if (other.numParking != null)
				return false;
		} else if (!numParking.equals(other.numParking))
			return false;
		if (prix != other.prix)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parking [numParking=" + numParking + ", nomParking=" + nomParking + ", codePostal=" + codePostal
				+ ", prix=" + prix + ", description=" + description + ", numCommune=" + numCommune + "]";
	}
	
	
}
