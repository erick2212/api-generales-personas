package com.govea.apipersonas.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Validated
@Data
public class Configuracion {
	@NotBlank
    private String url;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
