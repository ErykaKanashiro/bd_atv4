package com.java.banco.atv4.service;

import com.java.banco.atv4.entity.Cargo;
import com.java.banco.atv4.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;

    @Autowired
    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> listarCargos() {
        return cargoRepository.findAll();
    }

    public Optional<Cargo> buscarCargoPorId(Long id) {
        return cargoRepository.findById(id);
    }

    public Cargo salvarCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public void deletarCargoPorId(Long id) {
        cargoRepository.deleteById(id);
    }
}
