package com.example.microservicioemployee.service;

import com.example.microservicioemployee.dto.DepartamentDTO;
import com.example.microservicioemployee.dto.ResponseDTO;
import com.example.microservicioemployee.entity.Employee;
import com.example.microservicioemployee.repository.EmployeeRespository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * gestiona el contenido de la solicitud en http que llega por el controlador
 */
@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRespository employeeRespository;

    private final RestTemplate restTemplate;

    /**
     * guarda un empleado en la base de datos
     * @param employee type Employee
     * @return el empleado una ves creado en la base de datos
     */
    public Employee saveEmployee(Employee employee){
        return employeeRespository.save(employee);
    }

    /**
     * muestra todos los empleados en el sistema
     * @return List de Employee en la base de datos
     */
    public List<Employee> getEmployeeAll(){
        return employeeRespository.findAll();
    }

    /**
     * con el id del empleado busca el empleado y su departamento que esta almacendo en otro servicio
     * @param id Long del empleado en la base de datos
     * @return responseDTO que contiene los datos del empleado y del departamento
     */
    public ResponseDTO getEmployeeById(Long id){
        ResponseDTO responseDTO = new ResponseDTO();
        Employee employee = employeeRespository.findById(id).get();
        //se indica la direccion donde esta alojado el servicio de departamento, y el tipo de respuesta
        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/departaments/"+employee.getdepartamentId(),
                DepartamentDTO.class);
        //se extrae el cuerpo de la solicitud y se almacena
        DepartamentDTO departamentDTO = responseEntity.getBody();
        responseDTO.setDepartamentDTO(departamentDTO);
        responseDTO.setEmployee(employee);
        return responseDTO;
    }



}
