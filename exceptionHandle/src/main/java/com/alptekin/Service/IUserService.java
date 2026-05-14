package com.alptekin.Service;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;

public interface IUserService {

    public DtoUserResponse getUserById(Integer id);

    public DtoUserResponse addUser(DtoUserRequest user);

}
