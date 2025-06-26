package io.github.kriolos.efatura.kriolosefaturaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.GenericWebApplicationContext;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.repositories.ClientRepository;

@SpringBootApplication
public class KriolosEfaturaServiceApplication {

	@Autowired
	private GenericWebApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(KriolosEfaturaServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ClientRepository repository) {
		return (args) -> {
			repository.save(new Client("syncit", "289308496", "lausdeo156@@!"));
		};
	}
}
