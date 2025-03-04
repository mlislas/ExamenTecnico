package com.maria.marvel.service;

import io.swagger.client.model.Character;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockserver.model.MediaType.APPLICATION_JSON;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class MarvelApiServiceTest {
	
	@Autowired
    private MarvelApiService marvelApiService;
    private ClientAndServer mockServer;
	@Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        // Iniciar MockServer en el puerto 1080
        mockServer = ClientAndServer.startClientAndServer(1080);

    }

    @AfterEach
    void tearDown() {
        mockServer.stop();
    }

    @Test
    void testGetCharacters() throws JsonProcessingException {
        // Simular una respuesta JSON de la API de Marvel
        String mockResponse = "{ \"data\": { \"results\": [{ \"id\": 1, \"name\": \"Spider-Man\" }] } }";

        // Configurar MockServer para interceptar la llamada y devolver la respuesta simulada
        mockServer
            .when(HttpRequest.request()
                .withMethod("GET")
                .withPath("/characters"))
            .respond(HttpResponse.response()
                .withBody(mockResponse)
                .withContentType(APPLICATION_JSON));


        // Llamar al método real de MarvelApiService
        List<?> response =  marvelApiService.getCharacters();
        // Validar que la respuesta no es nula
        assertNotNull(response);     
        String characterStr = objectMapper.writeValueAsString( response.getFirst());
        Character character = objectMapper.readValue(characterStr, Character.class);
        assertEquals("Spider-Man", character.getName());
    }
}

