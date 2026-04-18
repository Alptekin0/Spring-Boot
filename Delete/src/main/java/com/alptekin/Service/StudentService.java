package com.alptekin.Service;


import com.alptekin.Repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }

}
