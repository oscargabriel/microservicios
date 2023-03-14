package com.example.microserviciodepartament.controller;

import com.example.microserviciodepartament.entity.Departament;
import com.example.microserviciodepartament.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/departaments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Departament> createDepartament(@RequestBody Departament departament){
        return ResponseEntity.ok(departmentService.createDepartament(departament));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departament> getDepartamentById(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @GetMapping
    public ResponseEntity<List<Departament>> getDepartamentAll(){
        return ResponseEntity.ok(departmentService.getDepartmentAll());
    }




}
