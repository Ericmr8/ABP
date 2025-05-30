package com.example.demo_emr.repository;

import com.example.demo_emr.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Long> {
    // Métodos personalizados opcionales
}

