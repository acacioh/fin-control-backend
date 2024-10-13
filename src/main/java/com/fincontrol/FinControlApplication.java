package com.fincontrol;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FinControlApplication {

    @Value("${server.port}")
    private int port;
    @Value("${server.servlet.context-path}")
    private String contextPath;

    @PostConstruct
    private void message() {
        log.info("Visit: http://localhost:{}{}/swagger-ui/index.html", port, contextPath);
    }

    public static void main(String[] args) {
        SpringApplication.run(FinControlApplication.class, args);
    }

}
