package com.guillerdev97.basiccrud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    public static final Month AUGUST = Month.AUGUST;
    public static final Month MARCH = Month.MARCH;

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student guiller = new Student(
                    "Guiller",
                    "guiller@gmail.com",
                    LocalDate.of(1990, AUGUST, 5)
            );

            Student marta = new Student(
                    "Marta",
                    "marta@gmail.com",
                    LocalDate.of(1992, MARCH, 5)
            );

            repository.saveAll(
                    List.of(guiller, marta)
            );
        };
    }
}
