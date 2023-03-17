package com.example.microservicioemployee.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * referencia para los datos que van a llegar desde el programa de departament
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentDTO {

    private Long id;


    private String name;


    private String code;
}
