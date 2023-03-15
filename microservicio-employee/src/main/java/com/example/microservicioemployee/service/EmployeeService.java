package com.example.microservicioemployee.service;

import com.example.microservicioemployee.dto.DepartamentDTO;
import com.example.microservicioemployee.dto.ResponseDTO;
import com.example.microservicioemployee.entity.Employee;
import com.example.microservicioemployee.repository.EmployeeRespository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRespository employeeRespository;

    private final RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee){
        return employeeRespository.save(employee);
    }

    public List<Employee> getEmployeeAll(){
        return employeeRespository.findAll();
    }

    public ResponseDTO getEmployeeById(Long id){
        ResponseDTO responseDTO = new ResponseDTO();
        Employee employee = new Employee();
        employee = employeeRespository.findById(id).get();
        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/departaments/"+employee.getId(),
                DepartamentDTO.class);
        DepartamentDTO departamentDTO = responseEntity.getBody();
        responseDTO.setDepartamentDTO(departamentDTO);
        responseDTO.setEmployee(employee);
        return responseDTO;
    }



}
