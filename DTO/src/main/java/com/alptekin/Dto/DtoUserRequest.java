package com.alptekin.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserRequest {

    private int Id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phoneNumber;

    private String gender;
}
