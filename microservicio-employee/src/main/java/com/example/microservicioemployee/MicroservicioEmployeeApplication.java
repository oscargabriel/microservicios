package com.example.microservicioemployee;

import com.example.microservicioemployee.repository.EmployeeRespository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicioEmployeeApplication {
	private final EmployeeRespository employeeRespository;

	public MicroservicioEmployeeApplication(EmployeeRespository employeeRespository) {
		this.employeeRespository = employeeRespository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEmployeeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
