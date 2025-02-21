//package com.rest.apis;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RestCall {
//   @GetMapping("/hellorest/query")
//    public String sayHello(@RequestParam String name) {
//        return "Hello "+name+" from BridgeLabz !";
//    }
//}

package com.rest.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCall {

    // Handle GET request with a query parameter 'name'
    @GetMapping("/hellorest/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
