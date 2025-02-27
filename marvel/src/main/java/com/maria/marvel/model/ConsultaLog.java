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
	    @GeneratedValue(strategy = GenerationType.UUID)
	    private String id;

	    public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		private String endpoint;
	    private LocalDateTime fechaConsulta;
	    private String usrLog;
	 
	    public ConsultaLog() {
	    }

	    public ConsultaLog(String endpoint, LocalDateTime fechaConsulta) {
	        this.endpoint = endpoint;
	        this.fechaConsulta = fechaConsulta;
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

		public String getUsrLog() {
			return usrLog;
		}

		public void setUsrLog(String usrLog) {
			this.usrLog = usrLog;
		}
	    
	}



