package com.alptekin.Mapper;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public User toEntity (DtoUserRequest userRequest){
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPassword(userRequest.getPassword());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setGender(userRequest.getGender());

        return user;
    }

    public DtoUserResponse toResponse(User user) {
        DtoUserResponse userResponse = new DtoUserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setGender(user.getGender());

        return userResponse;
    }


}
