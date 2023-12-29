package com.java.banco.atv4.service;

import com.java.banco.atv4.entity.Departamento;
import com.java.banco.atv4.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    @Autowired
    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public List<Departamento> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarDepartamentoPorId(Long id) {
        return departamentoRepository.findById(id);
    }

    public Departamento salvarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public void deletarDepartamentoPorId(Long id) {
        departamentoRepository.deleteById(id);
    }

    public Optional<Departamento> encontrarPrimeiroDepartamento() {
        return departamentoRepository.findFirstByOrderByCdDepartamentoAsc();
    }
}
