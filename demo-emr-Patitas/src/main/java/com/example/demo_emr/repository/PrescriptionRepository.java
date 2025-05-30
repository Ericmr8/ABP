package com.example.demo_emr.repository;

import com.example.demo_emr.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    // Métodos personalizados opcionales
}
