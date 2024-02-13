package io.github.kriolos.efatura.kriolosefaturaservice.services;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import io.github.kriolos.efatura.models.Client;

@Service
public class ClientService  { 

    public Stream<Client> getClients() 
    {
        Client c = Client.builder().nif(1234567890)
        .name("1234567890")
        .password("secretas")
        .build();
        return Stream.of(c);
    } 
}
