package com.maria.marvel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class AuthConfig {

	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
        // Permite solicitudes desde localhost:4200
        config.addAllowedOrigin("http://localhost:4200");
        config.addAllowedMethod("*"); // Permitir todos los métodos (GET, POST, PUT, DELETE)
        config.addAllowedHeader("*"); // Permitir todos los headers
        config.setAllowCredentials(true); // Permitir credenciales como cookies, cabeceras de autenticación, etc.

        // Establecer la configuración para todas las rutas
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

	
	
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors()
            .and()
            .csrf(csrf -> csrf.disable()) // Deshabilita CSRF si no necesita protección contra ataques CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/marvel/**").authenticated() // Protege solo las rutas específicas
                .anyRequest().permitAll() // Permite acceso libre a todas las demás rutas
            )
            .httpBasic();
             // Habilita autenticación básica

        return http.build();
    }
    

	@Bean
 	public UserDetailsService userDetailsService() {
 		UserDetails user = User.withDefaultPasswordEncoder()
 			.username("user")
 			.password("password")
 			.roles("USER")
 			.build();
 		return new InMemoryUserDetailsManager(user);
 	}
}