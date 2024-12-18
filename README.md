# SERVIDOR EUREKA

## Descripción

Servidor que registra todos los microservicios permitiendo que estos interactúen y se comuniquen entre sí, mejorando la escalabilidad y tolerancia a fallos del sistema al manejar automáticamente la disponibilidad de los servicios.

## Objetivo

El objetivo principal de este proyecto es proporcionar un servidor Eureka para la plataforma Wakanda Central, permitiendo la gestión y el descubrimiento de microservicios de manera eficiente.

## Estructura del Proyecto

### `ServidorEurekaApplication.java`

Esta clase es el punto de entrada de la aplicación Spring Boot. Anotada con `@SpringBootApplication` y `@EnableEurekaServer`, configura y lanza el servidor Eureka.

### `application.properties`

Este archivo contiene la configuración de la aplicación, incluyendo el nombre de la aplicación, la configuración del servidor Eureka y la configuración de Prometheus para la monitorización.

### `pom.xml`

Este archivo de Maven define las dependencias del proyecto, incluyendo Spring Boot, Spring Cloud Netflix Eureka Server, y otras dependencias necesarias para el desarrollo y la monitorización.

### `Dockerfile`

Este archivo define la imagen Docker para el servidor Eureka. Utiliza una imagen base de OpenJDK 17 y copia el archivo JAR generado por Maven para ejecutar la aplicación.

### `compose.yaml`

Este archivo define los servicios Docker para el servidor Eureka y los microservicios de la plataforma Wakanda Central. Configura los puertos, nombres de contenedores y variables de entorno necesarias para cada servicio.

## Función de Cada Archivo

- **`ServidorEurekaApplication.java`**: Configura y lanza el servidor Eureka.
- **`application.properties`**: Configura las propiedades de la aplicación y del servidor Eureka.
- **`pom.xml`**: Define las dependencias y plugins de Maven necesarios para el proyecto.
- **`Dockerfile`**: Define la imagen Docker para el servidor Eureka.
- **`compose.yaml`**: Define y configura los servicios Docker para el servidor Eureka y los microservicios asociados.

## Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

1. **Compilar el proyecto**:
   ```sh
   mvn clean install
