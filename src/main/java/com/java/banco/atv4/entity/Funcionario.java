package com.java.banco.atv4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "funcionario")
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_funcionario",nullable=false)
    private Long cdFuncionario;

    @Column(name = "nm_funcionario")
    private String nmFuncionario;

    @Column(name = "qtd_dependentes")
    private int qtdDependentes;
    private double salario;

    @ManyToOne
    @JoinColumn(name = "cd_departamento")
    private Departamento cdDepartamento;

    @ManyToOne
    @JoinColumn(name = "cd_cargo")
    private Cargo cdCargo;
}
