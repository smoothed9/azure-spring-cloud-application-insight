package com.sudeep.azure.springcloud.servicee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping
    public ResponseEntity<String> getData() {
        try {
            // Purposefully added a sleep to show the difference in response time
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("Success from Service E");
    }
}
