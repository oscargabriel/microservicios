package com.example.microserviciodepartament.service;

import com.example.microserviciodepartament.entity.Departament;
import com.example.microserviciodepartament.repository.DepartmentRespository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRespository departmentRespository;

    public DepartmentService(DepartmentRespository departmentRespository) {
        this.departmentRespository = departmentRespository;
    }

    public Departament createDepartament (Departament departament){
        return departmentRespository.save(departament);
    }

    public Departament getDepartmentById(Long id){
        return departmentRespository.findById(id).get();
    }
}
