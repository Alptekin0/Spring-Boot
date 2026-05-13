package com.alptekin.mapper;


import com.alptekin.Dto.DtoStudentRequest;
import com.alptekin.Dto.DtoStudentResponse;
import com.alptekin.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(DtoStudentRequest student);

    DtoStudentResponse toResponse(Student student);

}
