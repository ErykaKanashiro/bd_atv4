package com.java.banco.atv4;

import com.java.banco.atv4.entity.Cargo;
import com.java.banco.atv4.entity.Departamento;
import com.java.banco.atv4.entity.Funcionario;
import com.java.banco.atv4.service.CargoService;
import com.java.banco.atv4.service.DepartamentoService;
import com.java.banco.atv4.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Atv4Application {

    private static final Logger log = LoggerFactory.getLogger(Atv4Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Atv4Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CargoService cargoService,
                                  FuncionarioService funcionarioService,
                                  DepartamentoService departamentoService) {
        return (arg) -> {
            
            Departamento departamento1 = new Departamento();

            log.info("Lista de Todos os Funcionarios");
            for (Funcionario funcionario : funcionarioService.listarFuncionarios())
                log.info(funcionario.toString());
            log.info("");

            log.info("Lista de Todos os Cargos");
            for (Cargo cargo : cargoService.listarCargos())
                log.info(cargo.toString());
            log.info("");

            log.info("Lista de Todos os Departamentos");
            for (Departamento departamento : departamentoService.listarDepartamentos()) {
                log.info(departamento.toString());
                departamento1 = departamento;
            }
            log.info("");

            log.info("Lista funcionário por nome e Quantidade de Dependentes");
            for (Funcionario funcionario : funcionarioService.findByNomeAndDependentes("Ana",3))
                log.info(funcionario.toString());
            log.info("");

            log.info("Busca funcionário por departamento");
            for (Funcionario funcionario : funcionarioService.buscarPorDepartamento(departamento1))
                log.info(funcionario.toString());
            log.info("");

            log.info("Primeiro departamento:");
             var primeiroDpto = departamentoService.encontrarPrimeiroDepartamento();
            primeiroDpto.ifPresent(departamento -> log.info(departamento.toString()));
            log.info("");

        };

    }
}
