package com.example.microservicioemployee.dto;

import com.example.microservicioemployee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private Employee employee;

    private DepartamentDTO departamentDTO;
}
