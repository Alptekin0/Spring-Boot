package com.alptekin.Dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserRequest {

    @NotNull(message = "E-mail is required and cannot be empty.")
    @Size(max = 150, min = 10, message = "E-Mail must be between 10 and 150 characters.")
    private String email;

    @NotNull(message = "Name is required and cannot be empty.")
    @Size(max = 150, min = 2, message = "Name must be between 10 and 150 characters.")
    private String firstName;

    @NotNull(message = "Last Name is required and cannot be empty.")
    @Size(max = 150, min = 2, message = "Last Name must be between 10 and 150 characters.")
    private String lastName;

    @NotNull(message = "Gender is required and cannot be empty.")
    @Size(max = 50, min = 2, message = "Gender must be between 2 and 50 characters.")
    private String gender;

    @NotNull(message = "Password is required and cannot be empty.")
    @Size(max = 50, min = 8, message = "Password must be between 8 and 50 characters.")
    private String password;

    @NotNull(message = "Phone Number is required and cannot be empty.")
    @Size(max = 11, min = 11, message = "Phone Number must be 11 characters.")
    private String phoneNumber;
}
