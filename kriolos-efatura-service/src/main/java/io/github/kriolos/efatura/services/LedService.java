package io.github.kriolos.efatura.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.kriolos.efatura.clientapi.generated.ApiException;
import io.github.kriolos.efatura.clientapi.generated.api.LedApi;
import io.github.kriolos.efatura.clientapi.generated.model.LedDto;
import io.github.kriolos.efatura.clientapi.generated.model.SaveLedDto;

public class LedService {

    private final LedApi ledApi;

    public LedService(LedApi ledApi) {
        this.ledApi = ledApi;
    }

    public List<LedDto> GetLed (int year ) throws ApiException  {
        return this.ledApi.ledResourceGetAllLeds().getPayload()
            .stream()
            .filter( l ->  Integer.parseInt(l.getSerie()) == year)
            .collect(Collectors.toList());
            
    }

    public void CreateLed (List<LedDto> leds, String serie) { 
        leds.stream().map( l -> {
            SaveLedDto led = new SaveLedDto();
            // led.setCode(l.getCode().toString());
            led.setDescription(l.getDescription());
            led.setSerie(serie);
            led.setSoftwareCode(l.getSoftwareCode());
            led.setAddressCode(l.getAddressCode());
            led.setAddressDetail(l.getAddressDetail());
            return led;
        }).forEach( l -> {
            try {
                this.ledApi.ledResourceCreateLed(l);
            } catch (ApiException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }
}
