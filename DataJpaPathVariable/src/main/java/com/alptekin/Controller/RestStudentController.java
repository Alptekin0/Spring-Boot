package com.alptekin.Controller;


import com.alptekin.Entity.Student;
import com.alptekin.Service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestStudentController {

    private IStudentService iStudentService;

    public RestStudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentWithId(@PathVariable(name = "id") int id) {
        return iStudentService.getStudentWithId(id);
    }



}
