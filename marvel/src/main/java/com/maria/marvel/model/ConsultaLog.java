package com.maria.marvel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;


	
	@Entity
	@Table(name = "consulta_log")
	public class ConsultaLog {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String endpoint;
	    private LocalDateTime fechaConsulta;

	    public ConsultaLog() {
	    }

	    public ConsultaLog(String endpoint, LocalDateTime fechaConsulta) {
	        this.endpoint = endpoint;
	        this.fechaConsulta = fechaConsulta;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getEndpoint() {
	        return endpoint;
	    }

	    public void setEndpoint(String endpoint) {
	        this.endpoint = endpoint;
	    }

	    public LocalDateTime getFechaConsulta() {
	        return fechaConsulta;
	    }

	    public void setFechaConsulta(LocalDateTime fechaConsulta) {
	        this.fechaConsulta = fechaConsulta;
	    }
	    
	}



