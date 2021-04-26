package com.FoundationAcademy.SchoolManagementSystem.Student;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> showAllStudents() {
        return studentService.showAllStudents();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@Validated @NotNull @RequestBody Student student) {
        studentService.addStudent(student);
        return student;
    }

}
