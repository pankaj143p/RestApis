package com.rest.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCallByPassName {

    // Corrected method signature with the proper usage of @PathVariable
    @GetMapping("/hellorestt/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz !";
    }
}
