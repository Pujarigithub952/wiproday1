package com.example.restaurantconsumer.controller;

import com.example.restaurantconsumer.client.RestaurantClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/consumer/restaurants")
public class ConsumerController {

    @Autowired
    private RestaurantClient restaurantClient;

    @GetMapping
    public List<Map<String, String>> fetchRestaurants() {
        return restaurantClient.getRestaurants();
    }
}
