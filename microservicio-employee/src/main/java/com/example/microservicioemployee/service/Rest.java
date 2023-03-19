package com.example.microservicioemployee.service;

import com.example.microservicioemployee.repository.EmployeeRespository;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
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

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI().info(new Info()
                .title("Microcontrollador para Employee")
                .version("0.11")
                .description("controlador para usuarios, se conecta con el controlador de departamento")
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
        );
    }



}
