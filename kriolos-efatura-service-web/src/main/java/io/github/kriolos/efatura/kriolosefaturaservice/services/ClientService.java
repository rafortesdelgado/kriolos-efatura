package io.github.kriolos.efatura.kriolosefaturaservice.services;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;

@Service
public class ClientService  { 

    public Stream<Client> getClients() 
    {
        Client c = Client.builder().nif(289308496)
        .name("syncit")
        .password("lausdeo156@@!")
        .build();
        return Stream.of(c);
    } 
}
