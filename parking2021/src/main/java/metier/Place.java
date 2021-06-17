package metier;

public class Place {
    private int numPlace;
    private String typePlace ="";
    private String libelle ="";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + numPlace;
		result = prime * result + occupation;
		result = prime * result + ((typePlace == null) ? 0 : typePlace.hashCode());
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
		Place other = (Place) obj;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (numPlace != other.numPlace)
			return false;
		if (occupation != other.occupation)
			return false;
		if (typePlace == null) {
			if (other.typePlace != null)
				return false;
		} else if (!typePlace.equals(other.typePlace))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Place [numPlace=" + numPlace + ", typePlace=" + typePlace + ", libelle=" + libelle + ", occupation="
				+ occupation + "]";
	}
    
    
}

