package com.alptekin.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentResponse {

    private String fullName;

    private Long number;

    private String email;

    private String classroom;

    private Boolean active;


}
