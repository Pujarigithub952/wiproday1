package com.example.circuitbreaker.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private final RestTemplate restTemplate;
    private static final String DELIVERY_SERVICE = "deliveryService";

    public DeliveryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = DELIVERY_SERVICE, fallbackMethod = "fallbackStatus")
    public String getDeliveryStatus() {
        String url = "http://localhost:8081/delivery/status";
        return restTemplate.getForObject(url, String.class);
    }

    // Fallback method must have same return type and an extra Throwable parameter (or Exception)
    public String fallbackStatus(Throwable t) {
        return "Delivery status service is currently unavailable. Please try again later.";
    }
}
