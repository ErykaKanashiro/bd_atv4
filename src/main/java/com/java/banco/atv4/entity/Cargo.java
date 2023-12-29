package com.java.banco.atv4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cargo")
@Data
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_cargo", nullable=false)
    private Long cdCargo;

    @Column(name = "nm_cargo", nullable=false)
    private String nmCargo;
}
