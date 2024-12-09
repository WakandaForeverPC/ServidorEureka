package com.example.wakandacentral;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControlService {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/status")
    public String checkServicesStatus() {
        String eurekaStatus = restTemplate.getForObject("http://localhost:8761/actuator/health", String.class);
        String wakandaStatus = restTemplate.getForObject("http://localhost:8080/actuator/health", String.class);
        return "Eureka Server Status: " + eurekaStatus + "\nWakanda Central Status: " + wakandaStatus;
    }
}