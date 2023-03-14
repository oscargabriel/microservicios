package com.example.microserviciodepartament.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="departaments")
@AllArgsConstructor//generar contructor con todos los elementos
@NoArgsConstructor//generar contructor sin argumentos
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String code;

}
