package com.maria.marvel.aspect;
import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.maria.marvel.model.ConsultaLog;
import com.maria.marvel.service.ConsultaLogService;

import jakarta.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LoggingAspect {
	
	private final ConsultaLogService consultaLogService;
	private final HttpServletRequest request;
	
	public LoggingAspect(ConsultaLogService consultaLogService, HttpServletRequest request){
		this.consultaLogService = consultaLogService;
		this.request = request;
	}
			
    @Around("within(com.maria.marvel.controller.MarvelController)") // Aplica a todos los métodos de MarvelController
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        // Obtener el usuario autenticado
        String usuario = obtenerUsuarioAutenticado();    

        // Log antes de ejecutar el método
        System.out.println("Usuario: " + usuario + " - Ejecutando método: " + joinPoint.getSignature().getName());

        // Obtener el endpoint (URI) de la solicitud
        String endpoint = request.getRequestURI();
       
        // Ejecutar el método original
        Object resultado = joinPoint.proceed();
        
        ConsultaLog consultaLog = new ConsultaLog();
        consultaLog.setUsrLog(usuario);
        consultaLog.setFechaConsulta(LocalDateTime.now());
        consultaLog.setEndpoint(endpoint);
        
        consultaLogService.registrar(consultaLog);

        // Log después de ejecutar el método
        System.out.println("Usuario: " + usuario + " - Método ejecutado: " + joinPoint.getSignature().getName());

        return resultado;
    }

    private String obtenerUsuarioAutenticado() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername(); // Devuelve el nombre de usuario
        } else {
            return "Usuario no autenticado";
        }
    }
}

