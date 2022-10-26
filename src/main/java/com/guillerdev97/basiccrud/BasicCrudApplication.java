package com.guillerdev97.basiccrud;

import com.guillerdev97.basiccrud.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class BasicCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicCrudApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "John",
                        "guiller@gmail.com",
                        LocalDate.of(1990, Month.MARCH, 10),
                        20
                )
        );
    }
}
