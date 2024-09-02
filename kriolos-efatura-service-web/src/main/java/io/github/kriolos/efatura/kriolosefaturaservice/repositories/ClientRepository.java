package io.github.kriolos.efatura.kriolosefaturaservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {
    Client findByNif(String nif);
}
