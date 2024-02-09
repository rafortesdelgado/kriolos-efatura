package io.github.kriolos.efatura.kriolosefaturaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.server.PWA;

@SpringBootApplication
// @PWA(name = "My Application", shortName = "My Application")
public class KriolosEfaturaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KriolosEfaturaServiceApplication.class, args);
	}

}
