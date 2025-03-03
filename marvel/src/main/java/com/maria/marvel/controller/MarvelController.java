package com.maria.marvel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maria.marvel.service.MarvelApiService;

import io.swagger.client.model.CharacterDataWrapper;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/marvel")
public class MarvelController {
    private final MarvelApiService marvelApiService;

    public MarvelController(MarvelApiService marvelApiService) {
        this.marvelApiService = marvelApiService;
    }


    @GetMapping("/characters")
    public ResponseEntity<?> getCharacters() {
        return ResponseEntity.ok(marvelApiService.getCharacters());
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<CharacterDataWrapper> getCharacterById(@PathVariable String id) {
        return ResponseEntity.ok(marvelApiService.getCharacterById(id));
    }
    
}
