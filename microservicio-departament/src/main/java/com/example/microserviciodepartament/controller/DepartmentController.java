package com.example.microserviciodepartament.controller;

import com.example.microserviciodepartament.entity.Departament;
import com.example.microserviciodepartament.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * recibe solicidutes get y post
 */
@RestController
@RequestMapping("/api/departaments")
public class DepartmentController {

    /**
     * isntancia de servicio para administrar el contenido del mensaje http
     */
    private final DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * creacion de departementos
     * @param departament datos del departemento
     * @return el departemento ya creado
     */
    @PostMapping
    public ResponseEntity<Departament> createDepartament(@RequestBody Departament departament){
        return ResponseEntity.ok(departmentService.createDepartament(departament));
    }

    /**
     * devuelve un departamento dado un id
     * @param id tipo Long para buscarlo en la base de datos
     * @return devuelve el departamento dentro de un ResponseEntitiy
     */
    @GetMapping("/{id}")
    public ResponseEntity<Departament> getDepartamentById(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    /**
     * mostrar todos los departamento en el sistema
     * @return lista completa de los departamentos
     */
    @GetMapping
    public ResponseEntity<List<Departament>> getDepartamentAll(){
        return ResponseEntity.ok(departmentService.getDepartmentAll());
    }




}
