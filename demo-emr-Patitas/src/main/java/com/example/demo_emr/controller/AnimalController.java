package com.example.demo_emr.controller;

import com.example.demo_emr.model.Animal;
import com.example.demo_emr.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id) {
        return animalService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.save(animal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id, @RequestBody Animal animalDetails) {
        return animalService.findById(id)
                .map(animal -> {
                    animal.setName(animalDetails.getName());
                    animal.setAge(animalDetails.getAge());
                    animal.setGenderEnum(animalDetails.getGenderEnum());
                    animal.setWeight(animalDetails.getWeight());
                    animal.setChip(animalDetails.isChip());
                    animal.setSterilized(animalDetails.isSterilized());
                    animal.setVaccinated(animalDetails.isVaccinated());
                    animal.setDisease(animalDetails.getDisease());
                    return ResponseEntity.ok(animalService.save(animal));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        if (animalService.findById(id).isPresent()) {
            animalService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}