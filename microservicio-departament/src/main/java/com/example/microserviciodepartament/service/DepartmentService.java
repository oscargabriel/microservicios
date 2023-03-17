package com.example.microserviciodepartament.service;

import com.example.microserviciodepartament.entity.Departament;
import com.example.microserviciodepartament.repository.DepartmentRespository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * para la administracion del contenido de los mensajes http
 */
@Service
public class DepartmentService {

    /**
     * referencia a la interface repository para la comunicacion con la base de datos
     */
    private final DepartmentRespository departmentRespository;

    public DepartmentService(DepartmentRespository departmentRespository) {
        this.departmentRespository = departmentRespository;
    }

    /**
     * creacion del departamento
     * @param departament recibe una clase Departament
     * @return devuevle el departamento ya construido
     */
    public Departament createDepartament (Departament departament){
        return departmentRespository.save(departament);
    }

    /**
     * mostrar un departamento dado su id
     * @param id Long que se recibe en la solicitud HTTP
     * @return el empleado si lo encuentra
     */
    public Departament getDepartmentById(Long id){
        return departmentRespository.findById(id).get();
    }

    /**
     * muestra todos los departamentos
     * @return List con todos los departemtnos
     */
    public List<Departament> getDepartmentAll(){
        return departmentRespository.findAll();
    }

}
