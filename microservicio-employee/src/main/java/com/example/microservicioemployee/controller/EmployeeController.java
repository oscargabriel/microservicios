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

/**
 * recibe solicidutes get y post
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    /**
     * guara empleado
     * @param employee del tipo Employee
     * @return el empleado ya almacenado en la base de datos
     */
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }


    /**
     * mostrar todos los empleados en el sistema
     * @return List de empleados en la base de datos
     */
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployeeAll(){
        return ResponseEntity.ok(employeeService.getEmployeeAll());
    }

    /**
     * muestra un empleado y su departamento asosciado en el microservicio de departament dado el id del empelado
     * @param id Long del ID del empleado
     * @return el empleado y su departamento
     */
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }




}
