package com.alptekin.service;

import com.alptekin.Dto.DtoStudentRequest;
import com.alptekin.Dto.DtoStudentResponse;
import com.alptekin.entity.Student;
import com.alptekin.mapper.StudentMapper;
import com.alptekin.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public DtoStudentResponse addStudent (DtoStudentRequest student) {
        Student newStudent = studentMapper.toEntity(student);
        Student savedStudent = studentRepository.save(newStudent);
        return studentMapper.toResponse(savedStudent);
    }


}
