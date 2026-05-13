package com.alptekin.controller;


import com.alptekin.Dto.DtoStudentRequest;
import com.alptekin.Dto.DtoStudentResponse;
import com.alptekin.service.IStudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentRestController {

    private final IStudentService iStudentService;

    @PostMapping("/addStudent")
    public DtoStudentResponse addStudent(@RequestBody @Valid DtoStudentRequest student){
        return iStudentService.addStudent(student);
    }


}
