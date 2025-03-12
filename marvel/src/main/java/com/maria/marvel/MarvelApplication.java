/**
 * Esta es la clase principal de la aplicación Spring Boot. Se encarga de inicializar y configurar el contexto de la aplicación.
 */
package com.maria.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan({"com.mary", "com.maria"})
public class MarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}

}
