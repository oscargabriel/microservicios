package com.example.microservicioemployee.repository;

import com.example.microservicioemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * gestiona las solicitudes CRUD a la base de datos en postgreSQL
 */
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}
