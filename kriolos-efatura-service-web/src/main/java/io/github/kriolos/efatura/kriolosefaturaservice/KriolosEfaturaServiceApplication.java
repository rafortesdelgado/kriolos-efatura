package io.github.kriolos.efatura.kriolosefaturaservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.repositories.ClientRepository;

@SpringBootApplication
public class KriolosEfaturaServiceApplication {

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
