package com.govea.apipersonas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class DatabaseConnectionValidator {
	@Autowired
    private Configuracion databaseProperties;

    @PostConstruct
    public void validarConexion() {
        System.out.println("🔍 Validando propiedades de conexión...");

        if (databaseProperties.getUrl().isEmpty() ||
            databaseProperties.getUsername().isEmpty() ||
            databaseProperties.getPassword().isEmpty()) {
            throw new IllegalStateException("❌ Faltan datos de conexión a la base de datos.");
        }

        System.out.println("✅ Propiedades cargadas correctamente:");
        System.out.println("   URL: " + databaseProperties.getUrl());
        System.out.println("   Usuario: " + databaseProperties.getUsername());
    }

}
