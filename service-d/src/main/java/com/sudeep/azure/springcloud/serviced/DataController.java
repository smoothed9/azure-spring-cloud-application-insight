package com.sudeep.azure.springcloud.serviced;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping
    public ResponseEntity<String> getData() {
        return ResponseEntity.ok("Success from Service D");
    }
}
