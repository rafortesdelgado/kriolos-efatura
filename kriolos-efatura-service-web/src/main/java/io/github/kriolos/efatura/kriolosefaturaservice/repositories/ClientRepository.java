package io.github.kriolos.efatura.kriolosefaturaservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {
    Client findByNif(String nif);
}
