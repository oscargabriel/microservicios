package com.example.microserviciodepartament.repository;

import com.example.microserviciodepartament.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends JpaRepository<Departament,Long> {
}
