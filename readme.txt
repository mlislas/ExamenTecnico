README - Proyecto de Consumo de API de Marvel  (Java 21)
María León Islas - Marzo 2025



Descripción General
Este proyecto consta de tres módulos principales:
1.Creación de un JAR para consumir los servicios de Marvel API.
Proyecto: marvel.client
2.Desarrollo de una API REST que utiliza el JAR para consumir los servicios de Marvel y almacena la bitácora de consultas en una base de datos H2.
Proyecto: marvel
3.Desarrollo de un frontend en Angular para consumir la API REST.
Proyecto marvel-app

---------------------------------------------------------------------------------------------
1.Creación de un JAR para consumir la API de Marvel
Alcance:
•Proyecto empaquetado con Maven.
•Implementación con Spring.
•Pruebas unitarias con JUnit.

Endpoints a consumir:
•/v1/public/characters
•/v1/public/characters/{characterId}

Pasos para ejecutar:
1.Clonar el repositorio y navegar al directorio del proyecto (marvel.client)
2.Ejecutar el siguiente comando para compilar y generar el JAR: 
	mvn clean install
	El JAR generado se encontrará en la carpeta target/


---------------------------------------------------------------------------------------------
2. Creación de una API REST
Alcance:
•Implementación con Spring Boot.
•Pruebas unitarias con JUnit y emulación de servicios con Mockito.
•Almacenamiento en base de datos H2 mediante JPA.
•Arquitectura MVC.
•Implementación de un mecanismo de autenticación.

Funcionalidades:
•Consumo del JAR creado en el paso 1 para obtener información de personajes de Marvel.
•Almacenamiento en H2 de la bitácora de consultas a los servicios.
•Implementación de autenticación para el acceso a los endpoints.

Pasos para ejecutar:
1.Clonar el repositorio y navegar al directorio del proyecto (marvel).
2.Ejecutar el siguiente comando para compilar y ejecutar la API REST: 
	mvn spring-boot:run
	Acceder a la API en http://localhost:8080


---------------------------------------------------------------------------------------------
3. Desarrollo del Frontend en Angular (marvel-app)
Alcance:
•Implementación con Angular.
•Integración con la API REST creada en el punto 2.

Funcionalidades:
•Pantalla 1: Listado de personajes de Marvel obtenidos desde la API REST.
•Popup de detalles: Al seleccionar un personaje, se mostrará un popup con su información.
•Pantalla 2: Visualización de la bitácora de consultas almacenadas en la base de datos H2.

Pasos para ejecutar:
1.Clonar el repositorio y navegar al directorio del proyecto.
2.Instalar las dependencias con: 
		npm install
	Ejecutar el proyecto con: 
		ng serve
	Acceder a la aplicación en http://localhost:4200


Repositorio y Control de Versiones
https://github.com/mlislas/ExamenTecnico
