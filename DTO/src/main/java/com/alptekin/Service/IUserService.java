package com.alptekin.Service;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;

import java.util.List;

public interface IUserService {

    public DtoUserResponse addUser(DtoUserRequest user);

    public List<DtoUserResponse> getUsers();


}
