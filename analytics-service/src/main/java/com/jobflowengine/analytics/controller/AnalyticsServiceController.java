package com.jobflowengine.analytics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnalyticsServiceController {
    // Test
    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world!");
    }
}
