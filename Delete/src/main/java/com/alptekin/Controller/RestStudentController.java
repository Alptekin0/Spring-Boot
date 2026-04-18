package com.alptekin.Controller;

import com.alptekin.Service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class RestStudentController {

    private StudentService studentService;

    public RestStudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public boolean deleteStudent(@PathVariable(name = "id") int id) {
        return studentService.deleteStudent(id);
    }

}