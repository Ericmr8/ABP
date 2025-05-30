package com.example.demo_emr.repository;

import com.example.demo_emr.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Métodos personalizados opcionales
}

