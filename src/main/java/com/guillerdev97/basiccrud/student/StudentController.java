package com.guillerdev97.basiccrud.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
   private final StudentService studentService;

   @Autowired
   public StudentController(StudentService studentService) {
       this.studentService = studentService;
   }

    @GetMapping
    public List<Student> list() {
        return studentService.list();
    }

    @PostMapping("/create")
    public Student create( @RequestBody Student student) {
       return studentService.create(student);
    }
}
