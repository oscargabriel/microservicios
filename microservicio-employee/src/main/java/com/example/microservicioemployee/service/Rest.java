package com.example.microservicioemployee.service;

import com.example.microservicioemployee.repository.EmployeeRespository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * administracion del RestTemplate para la coneccion con otra base de datos
 */
@Service
public class Rest {

    private final EmployeeRespository employeeRespository;

public Rest(EmployeeRespository employeeRespository) {
    this.employeeRespository = employeeRespository;
}

    /**
     * abilita el servicio de ResTemplate
     * @return crea un nuevo RestTemplate para su uso en EmployeeService
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
