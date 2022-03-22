package com.Dojo.Dojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import puntos.Filtro;

@SpringBootApplication
public class DojoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DojoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DojoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Filtro app = new Filtro();
		//app.distinct(); //Elimina el ultimo correo que esta igual
		app.filtro();
		//app.cantidadTotalCorreos();
		//app.cantidadCorreosGmail();
		//app.cantidadCorreosHotmail();
		//app.cantidadCorreosOutlook();
		//app.correoValido();

	}
}
