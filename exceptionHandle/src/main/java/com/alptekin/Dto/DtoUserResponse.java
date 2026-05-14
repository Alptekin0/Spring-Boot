package com.alptekin.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserResponse {

    private String email;

    private String firstName;

    private String lastName;


}
