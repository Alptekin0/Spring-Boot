package com.alptekin.Service;

import com.alptekin.Entity.StudentEntity;
import com.alptekin.Repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository StudentRepository){
        this.studentRepository = StudentRepository;
    }

    public StudentEntity getStudentByNumber(int Number) {
        return studentRepository.getStudentByNumber(Number);
    }




}
