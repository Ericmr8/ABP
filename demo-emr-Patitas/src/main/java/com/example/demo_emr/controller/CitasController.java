package com.example.demo_emr.controller;

import com.example.demo_emr.model.Citas;
import com.example.demo_emr.service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class CitasController {

    @Autowired
    private CitasService appointmentService;

    @GetMapping
    public List<Citas> getAllAppointments() {
        return appointmentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citas> getAppointmentById(@PathVariable Long id) {
        return appointmentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Citas createAppointment(@RequestBody Citas appointment) {
        return appointmentService.save(appointment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Citas> updateAppointment(@PathVariable Long id, @RequestBody Citas updated) {
        return appointmentService.findById(id)
                .map(appointment -> {
                    appointment.setFechaHora(updated.getFechaHora());
                    appointment.setHoraLlegada(updated.getHoraLlegada());
                    appointment.setHoraSalida(updated.getHoraSalida());
                    appointment.setAnimal(updated.getAnimal());
                    appointment.setCustomer(updated.getCustomer());
                    appointment.setDoctor(updated.getDoctor());
                    appointment.setMotivo(updated.getMotivo());
                    return ResponseEntity.ok(appointmentService.save(appointment));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
        if (appointmentService.findById(id).isPresent()) {
            appointmentService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}