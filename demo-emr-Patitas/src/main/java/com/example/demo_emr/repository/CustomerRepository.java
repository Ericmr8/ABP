package com.example.demo_emr.repository;

import com.example.demo_emr.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Métodos personalizados opcionales
}

