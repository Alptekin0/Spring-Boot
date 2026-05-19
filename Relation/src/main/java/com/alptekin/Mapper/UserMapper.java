package com.alptekin.Mapper;


import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",  uses = {ProfileMapper.class})
public interface UserMapper {

    User toEntity (DtoUserRequest user);

    DtoUserResponse toResponse (User user);

}
