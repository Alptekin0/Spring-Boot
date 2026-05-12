package com.alptekin.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoRequest {

    private int id;

    private String name;

    private String surname;

    private String email;

    private String password;

    private Integer age;

    private String phoneNumber;



}
