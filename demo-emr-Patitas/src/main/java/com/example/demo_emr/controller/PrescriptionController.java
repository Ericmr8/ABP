package com.example.demo_emr.controller;

import com.example.demo_emr.model.Prescription;
import com.example.demo_emr.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @GetMapping
    public List<Prescription> getAllPrescriptions() {
        return prescriptionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prescription> getPrescriptionById(@PathVariable Long id) {
        return prescriptionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Prescription createPrescription(@RequestBody Prescription prescription) {
        return prescriptionService.save(prescription);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prescription> updatePrescription(@PathVariable Long id, @RequestBody Prescription updated) {
        return prescriptionService.findById(id)
                .map(prescription -> {
                    prescription.setMedicamento(updated.getMedicamento());
                    prescription.setDosis(updated.getDosis());
                    prescription.setFrecuencia(updated.getFrecuencia());
                    prescription.setDuracion(updated.getDuracion());
                    prescription.setAnimal(updated.getAnimal());
                    prescription.setDoctor(updated.getDoctor());
                    return ResponseEntity.ok(prescriptionService.save(prescription));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrescription(@PathVariable Long id) {
        if (prescriptionService.findById(id).isPresent()) {
            prescriptionService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}