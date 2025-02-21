package com.rest.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Handle GET request
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz (GET)";
    }

    // Handle POST request
    @PostMapping("/hello")
    public String postHello() {
        return "Hello from BridgeLabz (POST)";
    }

    // Handle PUT request
    @PutMapping("/hello")
    public String putHello() {
        return "Hello from BridgeLabz (PUT)";
    }

    // Handle DELETE request
    @DeleteMapping("/hello")
    public String deleteHello() {
        return "Hello from BridgeLabz (DELETE)";
    }
}
