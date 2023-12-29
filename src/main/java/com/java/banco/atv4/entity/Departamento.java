package com.java.banco.atv4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "departamento")
@Data
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_departamento",nullable=false)
    private Long cdDepartamento;

    @Column(name = "nm_departamento")
    private String nmDepartamento;
}
