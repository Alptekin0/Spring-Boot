package com.alptekin.Service;

import com.alptekin.Dto.UserDtoRequest;
import com.alptekin.Dto.UserDtoResponse;
import com.alptekin.Entity.User;

public interface IUserService {

    public UserDtoResponse addUser(UserDtoRequest user);


}
