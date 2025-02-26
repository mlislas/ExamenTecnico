package com.maria.marvel.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import com.maria.marvel.model.ConsultaLog;
import com.maria.marvel.repository.ConsultaLogRepository;
import com.mary.marvelapp.service.MarvelService;

import io.swagger.client.model.CharacterDataWrapper;


@Service
public class MarvelApiService {
    private final MarvelService marvelService;
    private final ConsultaLogRepository logRepository;

    public MarvelApiService(MarvelService marvelService, ConsultaLogRepository logRepository) {
        this.marvelService = marvelService;
        this.logRepository = logRepository;
    }

    public CharacterDataWrapper getCharacters() {
        logRepository.save(new ConsultaLog("GET /characters", LocalDateTime.now()));
        return marvelService.getMarvelCharacters();
    }

    public CharacterDataWrapper getCharacterById(String id) {
        logRepository.save(new ConsultaLog("GET /characters/" + id, LocalDateTime.now()));
        return marvelService.getMarvelCharacterById(id);
    }
}