package com.example.demo_emr.repository;

import com.example.demo_emr.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    // Puedes agregar métodos personalizados si quieres
}
