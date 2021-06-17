package Fr.miage.projet.parking2021;

import metier.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AffichageClient
 */
@WebServlet("/AffichageClient")
public class AffichageClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * Map
     */
	private Parking parking;
	
    @Override
    public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
	setParking(new Parking());
    }
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffichageClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/parking.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	public Parking getParking() {
		return parking;
	}


	public void setParking(Parking parking) {
		this.parking = parking;
	}

}
