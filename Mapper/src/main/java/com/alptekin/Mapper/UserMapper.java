package com.alptekin.Mapper;


import com.alptekin.Dto.UserDtoRequest;
import com.alptekin.Dto.UserDtoResponse;
import com.alptekin.Entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDtoRequest dto);

    UserDtoResponse toDto(User user);

}
