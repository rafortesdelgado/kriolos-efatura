/*
 * e-Fatura API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: helpdesk@efatura.cv
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.kriolos.efatura.clientapi.generated.api;

import io.github.kriolos.efatura.clientapi.generated.*;
import io.github.kriolos.efatura.clientapi.generated.auth.*;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseBoolean;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseLedDto;
import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseListLedDto;
import io.github.kriolos.efatura.clientapi.generated.model.SaveLedDto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LedApi
 */
public class LedApiTest {

    private final LedApi api = new LedApi();

    /**
     * Regista uma nova LED.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ledResourceCreateLedTest() throws ApiException {
        //SaveLedDto saveLedDto = null;
        //PayloadProcessingResponseLedDto response = api.ledResourceCreateLed(saveLedDto);
        // TODO: test validations
    }

    /**
     * Elimina uma LED sem DFEs associados.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ledResourceDeleteLedTest() throws ApiException {
        //String ledCode = null;
        //PayloadProcessingResponseBoolean response = api.ledResourceDeleteLed(ledCode);
        // TODO: test validations
    }

    /**
     * Lista de LEDs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ledResourceGetAllLedsTest() throws ApiException {
        //PayloadProcessingResponseListLedDto response = api.ledResourceGetAllLeds();
        // TODO: test validations
    }

    /**
     * Consulta de LED com código.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ledResourceGetLedByCodeTest() throws ApiException {
        //String ledCode = null;
        //PayloadProcessingResponseLedDto response = api.ledResourceGetLedByCode(ledCode);
        // TODO: test validations
    }

    /**
     * Atualiza uma LED.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ledResourceUpdateLedTest() throws ApiException {
        //String ledCode = null;
        //SaveLedDto saveLedDto = null;
        //PayloadProcessingResponseLedDto response = api.ledResourceUpdateLed(ledCode, saveLedDto);
        // TODO: test validations
    }

}