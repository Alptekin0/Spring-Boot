package com.alptekin.controller;

import com.alptekin.entity.Student;
import com.alptekin.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentService.getStudents(id);
    }
}