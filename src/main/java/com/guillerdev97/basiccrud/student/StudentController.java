package com.guillerdev97.basiccrud.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> list() {
        return List.of(
                new Student(
                        1L,
                        "John",
                        "john@gmail.com",
                        LocalDate.of(1990, Month.APRIL, 10),
                        32
                )
        );
    }
}
