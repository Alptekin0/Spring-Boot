package com.alptekin.Dto;

import com.alptekin.Entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserResponse {

    private String email;

    private DtoProfile profile;


}
