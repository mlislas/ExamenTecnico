package com.maria.marvel.controller;

import org.springframework.web.bind.annotation.*;
import com.maria.marvel.model.ConsultaLog;
import com.maria.marvel.service.ConsultaLogService;

import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class ConsultaLogController {

    private final ConsultaLogService consultaLogService;
    
    public ConsultaLogController(ConsultaLogService consultaLogService){
		this.consultaLogService = consultaLogService;    	
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ConsultaLog>> obtenerConsultas() {
        return ResponseEntity.ok(consultaLogService.consultaLog());
    }
}
