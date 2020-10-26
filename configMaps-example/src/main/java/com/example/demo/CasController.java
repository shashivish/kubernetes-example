package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasController {

    @Value("${com.casunified.property.value}")
    String configMapValue;


    @GetMapping("/configMap")
    String getConfigMapValue()
    {
        return configMapValue;
    }

}
