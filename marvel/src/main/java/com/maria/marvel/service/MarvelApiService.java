package com.maria.marvel.service;

import org.springframework.stereotype.Service;
import com.maria.marvel.repository.ConsultaLogRepository;
import com.mary.marvelapp.service.MarvelService;

import io.swagger.client.model.CharacterDataWrapper;


@Service
public class MarvelApiService {
    private final MarvelService marvelService;
    public MarvelApiService(MarvelService marvelService, ConsultaLogRepository logRepository) {
        this.marvelService = marvelService;
    }

    public CharacterDataWrapper getCharacters() {
        return marvelService.getMarvelCharacters();
    }

    public CharacterDataWrapper getCharacterById(String id) {
        return marvelService.getMarvelCharacterById(id);
    }
}