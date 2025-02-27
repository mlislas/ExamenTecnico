package com.mary.marvelapp.service;

import com.mary.marvel.utils.MarvelApiUtils;
import io.swagger.client.model.CharacterDataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MarvelService {

    //private static final String PRIVATE_KEY = "6908738ed9365147415738f47d69f1669ccf9691";
    //private static final String PUBLIC_KEY = "dc447ee6fb03816e58f8772b02cf8d2f";
    //private static final String BASE_URL = "https://gateway.marvel.com/v1/public/characters";
    
    @Value("${marvel.api.private-key}")
    protected String privateKey;

    @Value("${marvel.api.public-key}")
    protected String publicKey;

    @Value("${marvel.api.base-url}")
    protected String baseUrl;
    

    @Autowired
    private RestTemplate restTemplate;

    // Método para obtener la lista de personajes
    public CharacterDataWrapper getMarvelCharacters() {
        try {
            // Generar el timestamp
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            String hashInput = timestamp + privateKey + publicKey;
            String hash = MarvelApiUtils.generateMD5(hashInput);  // Generar hash MD5

            // Construir la URL
            String url = UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("ts", timestamp)
                    .queryParam("apikey", publicKey)
                    .queryParam("hash", hash)
                    .toUriString();

            // Realizar la solicitud GET usando RestTemplate
            return restTemplate.getForObject(url, CharacterDataWrapper.class);

        } catch (Exception e) {
            // Manejo adecuado de excepciones (por ejemplo, log y re-lanzar la excepción o retornar un valor predeterminado)
            throw new RuntimeException("Error al obtener los personajes de Marvel", e);
        }
    }

    // Método para obtener un personaje específico por ID
    public CharacterDataWrapper getMarvelCharacterById(String id) {
        try {
            // Generar el timestamp
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            String hashInput = timestamp + privateKey + publicKey;
            String hash = MarvelApiUtils.generateMD5(hashInput);  // Generar hash MD5

            // Construir la URL
            String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/" + id)
                    .queryParam("ts", timestamp)
                    .queryParam("apikey", publicKey)
                    .queryParam("hash", hash)
                    .toUriString();

            // Realizar la solicitud GET usando RestTemplate
            return restTemplate.getForObject(url, CharacterDataWrapper.class);

        } catch (Exception e) {
            // Manejo adecuado de excepciones (por ejemplo, log y re-lanzar la excepción o retornar un valor predeterminado)
            throw new RuntimeException("Error al obtener el personaje con ID: " + id, e);
        }
    }
}
