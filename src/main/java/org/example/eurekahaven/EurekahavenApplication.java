package org.example.eurekahaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekahavenApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekahavenApplication.class, args);
    }
}
