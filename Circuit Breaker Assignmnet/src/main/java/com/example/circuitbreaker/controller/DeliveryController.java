package com.example.circuitbreaker.controller;

import com.example.circuitbreaker.service.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/check-delivery")
    public String checkDeliveryStatus() {
        return deliveryService.getDeliveryStatus();
    }
}
