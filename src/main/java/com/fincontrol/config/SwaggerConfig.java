package com.fincontrol.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${spring.application.version}")
    private String version;
    @Value("${spring.application.git-hash}")
    private String gitHash;

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(new Info()
            .title("title")
            .description("description")
            .version("Version: " + version + " - Git Hash: " + gitHash)
        );
    }

}
