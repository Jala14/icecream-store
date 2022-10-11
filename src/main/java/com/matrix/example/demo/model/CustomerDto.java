package com.matrix.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class CustomerDto {
    private String name;
    private String surname;
    private Integer age;
    private LocalDate birthDate;
}
