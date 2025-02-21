package com.rest.apis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestCallByFirstAndLastName {
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello "+" "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz !";
    }
}

