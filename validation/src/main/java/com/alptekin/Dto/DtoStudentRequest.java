package com.alptekin.Dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentRequest {

    @NotNull(message = "Name cannot be null")
    @Length(max = 40, min = 2, message = "Username must be between 2 and 40 characters")
    private String fullName;

    @NotNull(message = "Number cannot be null")
    @Pattern(regexp = "^[0-9]{11}$", message = "Number must be 11 digits")
    private String number;

    @Email(message = "Please enter a valid email address")
    @NotNull(message = "E-mail cannot be null")
    private String email;

    @Length(max = 40, min = 8, message = "Password must be between 8 and 40 characters")
    @NotNull(message = "Password cannot be null")
    private String password;

    @Length(max = 140, min = 10, message = "Address must be between 8 and 40 characters")
    @NotNull(message = "Address cannot be null")
    private String address;

    @NotNull(message = "Classroom cannot be null")
    private String classroom;

    @NotNull(message = "Parent Name cannot be null")
    @Length(max = 40, min = 2, message = "Parent Name must be between 2 and 40 characters")
    private String parentName;

    @Pattern(
            regexp = "^[0-9]{11}$",
            message = "Number must contain 11 digits"
    )
    @NotNull(message = "Parent Phone Number cannot be null")
    private String parentPhoneNumber;

    @Max(value = 4, message = "Average Score cannot be grater than 4" )
    @NotNull(message = "Average Score cannot be null")
    private Double averageScore;

    @NotNull(message = "Active status is required")
    private Boolean active;


}
