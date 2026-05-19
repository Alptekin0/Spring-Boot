package com.alptekin.Dto;

import com.alptekin.Entity.Profile;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserRequest {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 8, max = 25)
    private String password;

    @NotNull
    private DtoProfile profile;

}
