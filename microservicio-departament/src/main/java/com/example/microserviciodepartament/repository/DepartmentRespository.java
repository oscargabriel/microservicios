package com.example.microserviciodepartament.repository;

import com.example.microserviciodepartament.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * repositorio para las llamdas crud mediante JPA
 */
@Repository
public interface DepartmentRespository extends JpaRepository<Departament,Long> {
}
