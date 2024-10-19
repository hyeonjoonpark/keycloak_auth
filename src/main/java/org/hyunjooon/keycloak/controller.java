package org.hyunjooon.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/api/v1/hello")
    public String hello() {
        return "Hello Keycloak!";
    }
}
