package com.example.demo_emr;

import com.example.demo_emr.model.Animal;
import com.example.demo_emr.model.GenderEnum;
import com.example.demo_emr.repository.AnimalRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository animalRepository;

    @Test
    void guardarYLeerAnimal() {
        Animal animal = new Animal();
        animal.setId(1L);
        animal.setName("Luna");           // Cambiado aquí
        animal.setAge(4);                 // Ejemplo con edad
        animal.setGenderEnum(GenderEnum.HEMBRA);  // Ajusta según tu enum
        animal.setWeight(5.2);
        animal.setChip(true);
        animal.setSterilized(true);
        animal.setVaccinated(true);
        animal.setDisease("Ninguna");

        animalRepository.save(animal);

        Animal encontrado = animalRepository.findById(1L).orElse(null);

        assertThat(encontrado).isNotNull();
        assertThat(encontrado.getName()).isEqualTo("Luna");  // Cambiado aquí
        assertThat(encontrado.getAge()).isEqualTo(4);
    }
}
