package com.example.demo_emr.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
//@DiscriminatorValue("NURSE")
public class Nurse extends Worker {
}