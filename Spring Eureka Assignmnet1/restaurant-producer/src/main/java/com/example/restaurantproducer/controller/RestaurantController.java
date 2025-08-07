package com.example.restaurantproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Map<String, String>> getRestaurants() {
        List<Map<String, String>> list = new ArrayList<>();
        list.add(Map.of("id", "1", "name", "Spice Hub", "location", "Hyderabad"));
        list.add(Map.of("id", "2", "name", "Food Court", "location", "Bangalore"));
        return list;
    }
}
