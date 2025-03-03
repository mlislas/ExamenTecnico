/** Prueba JUNIT*/
package com.maria.marvel.controller;
import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.maria.marvel.service.MarvelApiService;

import io.swagger.client.model.CharacterDataContainer;
import io.swagger.client.model.CharacterDataWrapper;

@ExtendWith(MockitoExtension.class)
class MarvelControllerTest {

    @Mock
    private MarvelApiService marvelApiService;

    @InjectMocks
    private MarvelController marvelController;

    @Test
    void testGetCharacters() {
        // Llamar al método del controlador
        ResponseEntity<?> response = marvelController.getCharacters();

        // Verificar que la respuesta no sea nula y tenga el estado esperado
        assertNotNull(response);
        assertNotNull(response.getBody());
    
    }

    @Test
    void testGetCharacterById() {
        // Arrange
        String characterId = "1009610"; // Ejemplo de ID (Spider-Man)
        CharacterDataWrapper mockResponse = new CharacterDataWrapper();
        when(marvelApiService.getCharacterById(characterId)).thenReturn(mockResponse);

        // Act
        ResponseEntity<CharacterDataWrapper> response = marvelController.getCharacterById(characterId);

        // Assert
        assertNotNull(response);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(mockResponse, response.getBody());
    }
}
