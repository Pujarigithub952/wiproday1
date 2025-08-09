package com.example.grocery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class GroceryController {

    @GetMapping("/grocery/public")
    public String publicMessage() {
        return "Welcome to the Grocery Store! This is a public endpoint.";
    }

    @GetMapping("/grocery/items")
    public List<String> getItems() {
        return Arrays.asList("Apples", "Bananas", "Tomatoes", "Onions");
    }

    @GetMapping("/grocery/orders")
    public List<String> getOrders() {
        return Arrays.asList("Order#1 - Apples, Bananas", "Order#2 - Onions, Tomatoes");
    }
}
