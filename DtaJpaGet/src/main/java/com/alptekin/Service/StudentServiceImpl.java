package com.alptekin.Service;


import com.alptekin.Entity.students;
import com.alptekin.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<students>  getStudents() {
        return studentRepository.findAll();
    }


}
