package com.java.banco.atv4.service;

import com.java.banco.atv4.entity.Departamento;
import com.java.banco.atv4.entity.Funcionario;
import com.java.banco.atv4.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> buscarFuncionariosPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionarioPorId(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public List<Funcionario> findByNomeAndDependentes(String nome, Integer dependentes){
        return funcionarioRepository.findBynmFuncionarioAndQtdDependentes(nome,dependentes);
    }

    public List<Funcionario> buscarPorDepartamento(Departamento departamento) {
        return funcionarioRepository.findByDepartamento(departamento);
    }
}
