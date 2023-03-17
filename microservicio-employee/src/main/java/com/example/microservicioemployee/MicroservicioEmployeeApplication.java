package com.example.microservicioemployee;

import com.example.microservicioemployee.repository.EmployeeRespository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicioEmployeeApplication {


	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEmployeeApplication.class, args);
	}



}
