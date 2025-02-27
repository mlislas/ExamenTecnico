package com.maria.marvel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maria.marvel.model.ConsultaLog;
import com.maria.marvel.repository.ConsultaLogRepository;

@Service
public class ConsultaLogService {
	private final ConsultaLogRepository consultaLogRepository;
	
	public ConsultaLogService(ConsultaLogRepository consultaLogRepository){
		this.consultaLogRepository = consultaLogRepository;
	}
	
    public void registrar(ConsultaLog consultaLog) {
    	consultaLogRepository.save(consultaLog);
        System.out.println("LOG: " + consultaLog);
    }
    
    public List<ConsultaLog> consultaLog(){
    	return consultaLogRepository.findAll();
    }
    
}
