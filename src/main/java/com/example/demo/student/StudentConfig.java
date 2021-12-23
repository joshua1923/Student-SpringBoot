package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student josh = new Student(
                    "Josh",
                    LocalDate.of(1994, JUNE,20),
                    "joshua_4991@hotmail.co.uk");

            Student paula = new Student(
                    "Paula",
                    LocalDate.of(1994, FEBRUARY,22),
                    "paulam94@outlook.com");

            repository.saveAll(List.of(josh, paula));
        };
    }
}
