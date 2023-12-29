package com.java.banco.atv4.repository;

import com.java.banco.atv4.entity.Departamento;
import com.java.banco.atv4.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findBynmFuncionarioAndQtdDependentes(@Param("nmFuncionario") String nome, @Param("qtdDependentes") int dependentes);

    @Query("SELECT f FROM Funcionario f WHERE f.cdDepartamento = :departamento")
    List<Funcionario> findByDepartamento(@Param("departamento") Departamento departamento);

}
