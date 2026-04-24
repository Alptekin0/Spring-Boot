package com.alptekin.Controller;

import com.alptekin.Service.IStudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class RestStudentController {

    private IStudentService iStudentService;

    public RestStudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public boolean deleteStudent(@PathVariable(name = "id") int id) {
        return iStudentService.deleteStudent(id);
    }



}
