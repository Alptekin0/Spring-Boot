package com.alptekin.service;

import com.alptekin.Dto.DtoStudentRequest;
import com.alptekin.Dto.DtoStudentResponse;

public interface IStudentService {

    public DtoStudentResponse addStudent (DtoStudentRequest student);


}
