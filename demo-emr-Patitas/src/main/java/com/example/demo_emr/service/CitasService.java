package com.example.demo_emr.service;

import com.example.demo_emr.model.Citas;
import com.example.demo_emr.repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CitasService {
    @Autowired
    private CitasRepository appointmentRepository;

    public List<Citas> findAll() {
        return appointmentRepository.findAll();
    }

    public Optional<Citas> findById(Long id) {
        return appointmentRepository.findById(id);
    }

    public Citas save(Citas appointment) {
        return appointmentRepository.save(appointment);
    }

    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }
}

