package com.example.demo_emr.service;

import com.example.demo_emr.model.Worker;
import com.example.demo_emr.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Optional<Worker> findById(Long id) {
        return workerRepository.findById(id);
    }

    public Worker save(Worker worker) {
        return workerRepository.save(worker);
    }

    public void deleteById(Long id) {
        workerRepository.deleteById(id);
    }
}

