package com.example.demo_emr.repository;

import com.example.demo_emr.model.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<Citas, Long> {
    // Métodos personalizados opcionales
}

