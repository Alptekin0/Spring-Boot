package com.alptekin.service;

import com.alptekin.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Optional<Student> getStudents(int id);

}
