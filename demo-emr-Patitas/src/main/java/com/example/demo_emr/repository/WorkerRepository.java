package com.example.demo_emr.repository;

import com.example.demo_emr.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    // Métodos personalizados opcionales
}
