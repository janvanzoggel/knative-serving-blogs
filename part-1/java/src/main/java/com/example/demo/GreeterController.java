package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreeterController
 */
@RestController
public class GreeterController {

    @Value("${MESSAGE:Knative on OpenShift}")
    private String message;

    @GetMapping("/")
    public String greet() {
        return"Java::"+message;
    }
}