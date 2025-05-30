package com.example.demo_emr.controller;

import com.example.demo_emr.model.Nurse;
import com.example.demo_emr.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nurses")
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @GetMapping
    public List<Nurse> getAllNurses() {
        return nurseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nurse> getNurseById(@PathVariable Long id) {
        return nurseService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Nurse createNurse(@RequestBody Nurse nurse) {
        return nurseService.save(nurse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nurse> updateNurse(@PathVariable Long id, @RequestBody Nurse updated) {
        return nurseService.findById(id)
                .map(nurse -> {
                    nurse.setNombre(updated.getNombre());
              //      nurse.setApellido(updated.getApellido());
                    nurse.setTelefono(updated.getTelefono());
                    nurse.setEmail(updated.getEmail());
                    nurse.setDireccion(updated.getDireccion());
                    nurse.setSalary(updated.getSalary());
                    nurse.setStartDate(updated.getStartDate());
                    return ResponseEntity.ok(nurseService.save(nurse));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNurse(@PathVariable Long id) {
        if (nurseService.findById(id).isPresent()) {
            nurseService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}