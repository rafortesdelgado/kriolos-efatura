package io.github.kriolos.efatura.kriolosefaturaservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//@Getter @Setter 
@Getter @Setter 
@Entity
public class Client {

    @Id
    @GeneratedValue
    public long id;
    
    public String nif;
    
    public String name;

    public String password;

    public Client(String name , String nif , String password) {
        this.name = name ; 
        this.nif = nif; 
        this.password = password;
    }

    public Client() {
        
    }
}
