package com.sudeep.azure.springcloud.messageservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {

    private RestTemplate restTemplate;

    public DataController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<String> getData() {
        StringBuilder response = new StringBuilder("Success from Message Service");

        ResponseEntity<String> serviceDResponse = restTemplate.getForEntity("http://SERVICE-D", String.class);
        response.append(", ").append(serviceDResponse.getBody());
        ResponseEntity<String> serviceEResponse = restTemplate.getForEntity("http://SERVICE-E", String.class);
        response.append(", ").append(serviceEResponse.getBody());

        return ResponseEntity.ok(response.toString());
    }
}
