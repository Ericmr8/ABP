package com.example.demo_emr.service;

import com.example.demo_emr.model.Nurse;
import com.example.demo_emr.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NurseService {
    @Autowired
    private NurseRepository nurseRepository;

    public List<Nurse> findAll() {
        return nurseRepository.findAll();
    }

    public Optional<Nurse> findById(Long id) {
        return nurseRepository.findById(id);
    }

    public Nurse save(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    public void deleteById(Long id) {
        nurseRepository.deleteById(id);
    }
}
