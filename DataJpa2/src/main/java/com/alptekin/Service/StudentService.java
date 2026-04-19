package com.alptekin.Service;


import com.alptekin.Enitity.students;
import com.alptekin.Repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public students addStudent(students student) {
        return studentRepository.save(student);
    }


}
