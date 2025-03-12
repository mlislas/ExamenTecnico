/**
 * Controlador REST que maneja los logs de consulta.
 * Expone un endpoint GET para listar los logs (/logs/listar).
 * Inyecta y usa un servicio (ConsultaLogService) para recuperar la información.
 * Retorna los datos en JSON dentro de un ResponseEntity.
 * Este código permite consultar los registros de logs desde la API.
 * 
 */

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
