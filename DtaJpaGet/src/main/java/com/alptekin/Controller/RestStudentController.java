package com.alptekin.Controller;


import com.alptekin.Entity.students;
import com.alptekin.Service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class RestStudentController {

    private IStudentService iStudentService;

    public RestStudentController (IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping("/getStudents")
    public List<students> getStudents() {
        return iStudentService.getStudents();
    }

}
