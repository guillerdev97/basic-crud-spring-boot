package com.guillerdev97.basiccrud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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
