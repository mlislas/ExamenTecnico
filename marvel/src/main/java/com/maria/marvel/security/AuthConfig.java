package com.maria.marvel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Deshabilita CSRF si no necesitas protección contra ataques CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/marvel/**").authenticated() // Protege solo las rutas específicas
                .anyRequest().permitAll() // Permite acceso libre a todas las demás rutas
            )
            .httpBasic(Customizer.withDefaults()); // Habilita autenticación básica

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