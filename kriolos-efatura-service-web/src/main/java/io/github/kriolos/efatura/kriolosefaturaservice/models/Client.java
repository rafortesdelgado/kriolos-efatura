package io.github.kriolos.efatura.kriolosefaturaservice.models;

import com.vaadin.flow.component.template.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class Client {
    @Id
    public int nif;
    
    public String name;

    public String password;
}
