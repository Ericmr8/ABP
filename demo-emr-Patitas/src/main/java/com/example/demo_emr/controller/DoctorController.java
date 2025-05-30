package com.example.demo_emr.controller;

import com.example.demo_emr.model.Doctor;
import com.example.demo_emr.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
        return doctorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.save(doctor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id, @RequestBody Doctor updated) {
        return doctorService.findById(id)
                .map(doctor -> {
                    doctor.setNombre(updated.getNombre());
            //        doctor.setApellido(updated.getApellido());
                    doctor.setTelefono(updated.getTelefono());
                    doctor.setEmail(updated.getEmail());
                    doctor.setDireccion(updated.getDireccion());
                    doctor.setSalary(updated.getSalary());
                    doctor.setStartDate(updated.getStartDate());
                    doctor.setEspecialidad(updated.getEspecialidad());
                    return ResponseEntity.ok(doctorService.save(doctor));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        if (doctorService.findById(id).isPresent()) {
            doctorService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}