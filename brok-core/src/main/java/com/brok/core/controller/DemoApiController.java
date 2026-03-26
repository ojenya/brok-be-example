package com.brok.core.controller;

import com.brok.core.dto.HelloResponse;
import com.brok.core.dto.StatusResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core/api")
public class DemoApiController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> getHello() {
        return ResponseEntity.ok(new HelloResponse("Hello from core"));
    }

    @GetMapping("/status")
    public ResponseEntity<StatusResponse> getStatus() {
        return ResponseEntity.ok(new StatusResponse("UP"));
    }
}
