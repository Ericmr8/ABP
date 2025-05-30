package com.example.demo_emr.repository;
import com.example.demo_emr.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    // Métodos personalizados opcionales
}
