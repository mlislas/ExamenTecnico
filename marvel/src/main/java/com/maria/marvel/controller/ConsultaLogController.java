package com.maria.marvel.controller;

import org.springframework.web.bind.annotation.*;

import com.maria.marvel.model.ConsultaLog;

import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class ConsultaLogController {

    private final List<ConsultaLog> logs = new ArrayList<>();

    @PostMapping("/registrar")
    public ResponseEntity<String> registrarConsulta(@RequestParam String endpoint) {
        ConsultaLog nuevoLog = new ConsultaLog(endpoint, LocalDateTime.now());
        logs.add(nuevoLog);
        return ResponseEntity.ok("Consulta registrada exitosamente.");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ConsultaLog>> obtenerConsultas() {
        return ResponseEntity.ok(logs);
    }
}
