package com.java.banco.atv4.repository;

import com.java.banco.atv4.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    Optional<Departamento> findFirstByOrderByCdDepartamentoAsc();

}
