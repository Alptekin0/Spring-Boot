package com.alptekin.Service;


import com.alptekin.Entity.Student;
import com.alptekin.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentWithId(int id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }


}
