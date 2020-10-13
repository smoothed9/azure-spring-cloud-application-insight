package com.sudeep.azure.springcloud.gatewayservice;

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
    public ResponseEntity<String> getServiceBData() {
        StringBuilder response = new StringBuilder();
        ResponseEntity<String> dataServiceResponse = restTemplate.getForEntity("http://DATA-SERVICE", String.class);
        response.append(dataServiceResponse.getBody());

        ResponseEntity<String> messageServiceResponse = restTemplate.getForEntity("http://MESSAGE-SERVICE", String.class);
        response.append(", ").append(messageServiceResponse.getBody());

        // This call is added to just show an extra arrow in the Application Insight
        restTemplate.getForEntity("http://SERVICE-D", String.class);

        return ResponseEntity.ok(response.toString());
    }
}
