package com.alptekin.Controller;


import com.alptekin.Enitity.students;
import com.alptekin.Service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class RestStudentController {

    private StudentService studentService;

    public RestStudentController (StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public students addStudent(@RequestBody students student) {
        return studentService.addStudent(student);
    }


}
