package io.github.kriolos.efatura.models;

import com.vaadin.flow.component.template.Id;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @Builder
public class Client {
    @Id
    public int nif;
    
    public String name;

    public String password;
}
