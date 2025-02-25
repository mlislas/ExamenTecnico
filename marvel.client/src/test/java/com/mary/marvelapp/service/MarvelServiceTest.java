package com.mary.marvelapp.service;

import io.swagger.client.model.CharacterDataWrapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;



@ExtendWith(MockitoExtension.class)
public class MarvelServiceTest {
	
	@Mock
    private RestTemplate restTemplate;
	
	@InjectMocks
    private MarvelService marvelService;

	@Test
    public void testGetMarvelCharacters() {
        // Configura el mock de RestTemplate para devolver un objeto ficticio de respuesta
        CharacterDataWrapper mockResponse = new CharacterDataWrapper(); // Configura tu mockResponse aquí
        Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.eq(CharacterDataWrapper.class)))
               .thenReturn(mockResponse);

        // Llama al método y verifica que la respuesta no sea nula
        CharacterDataWrapper response = marvelService.getMarvelCharacters();
        assertNotNull(response);
    }
	
	@Test
	public void testGetMarvelCharacterById() {
        // Configurar el mock de la respuesta esperada
        CharacterDataWrapper mockResponse = new CharacterDataWrapper();
        Mockito.when(restTemplate.getForObject(Mockito.anyString(), Mockito.eq(CharacterDataWrapper.class)))
               .thenReturn(mockResponse);

        // Llamar al método y verificar que la respuesta no es nula
        CharacterDataWrapper response = marvelService.getMarvelCharacterById("1011334");
        assertNotNull(response);
    		
	}

}
