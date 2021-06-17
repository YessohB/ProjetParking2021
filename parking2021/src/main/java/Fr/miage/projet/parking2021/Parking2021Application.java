package Fr.miage.projet.parking2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class Parking2021Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Parking2021Application.class, args);
	}

}
