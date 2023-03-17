package com.example.microservicioemployee.controller;

import com.example.microservicioemployee.dto.ResponseDTO;
import com.example.microservicioemployee.entity.Employee;
import com.example.microservicioemployee.repository.EmployeeRespository;
import com.example.microservicioemployee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;




    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }


    @GetMapping
    public ResponseEntity<List<Employee>> getEmployeeAll(){
        return ResponseEntity.ok(employeeService.getEmployeeAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }




}
