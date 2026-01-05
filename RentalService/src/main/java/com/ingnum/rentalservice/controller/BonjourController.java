package com.ingnum.rentalservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BonjourController {
    @Value("${customer.service.url}")
    private String customerServiceUrl;

    @GetMapping("/customer/{name}")
        public String sendName(@PathVariable String name) {

        RestTemplate restTemplate = new RestTemplate();

        try {
            String url = customerServiceUrl + "/microservice.php?name={name}";
            return restTemplate.getForObject(url, String.class, name);
        } catch (Exception e) {
            e.printStackTrace(); // log complet dans la console
            return "Erreur lors de l'appel au microservice : " + e.getMessage();
        }
}
}

