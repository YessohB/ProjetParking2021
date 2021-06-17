package metier;

import java.util.HashMap;
import java.util.Map;

public class Commune {
	/**
	 * Correspond a une map de parking avec ID en forme String
	 */
	private static Map<String, Parking> listParking;
	
	public Commune() {
		
		listParking = new HashMap<String, Parking>();
	}
	
	public void addParking(Parking parking) {
		Commune.listParking.put(parking.getNumParking(), parking);	
		}
	
	public void supprParking(Parking parking) {
    	listParking.remove(parking.getNumParking());
    }
	
    /**
     * supprime un parking de la map par son id
     * @param numParking  ID de Parking
     * 
     */
    public void supprParking(String numParking) {
        	Parking c = getParking(numParking);
    		supprParking(c);		
    }	
	public 	Map<String, Parking> getListParking() {
    	return listParking;
     }
	
    /**
     * trouve un parking par son id
     * @param id un ID de parking
     * @return un objet parking
     * 
     */
    public Parking getParking(String numParking) {
    		return listParking.get(numParking);
    	}
    /**
     * reset une MAP, utile pour certain affichage
     */
    public static void viderinfo() {
    	listParking.clear();
    }
	
}
