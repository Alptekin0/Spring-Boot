package com.alptekin.Service.Impl;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import com.alptekin.Mapper.UserMapper;
import com.alptekin.Repository.UserRepository;
import com.alptekin.Service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public DtoUserResponse addUser(DtoUserRequest user) {

        User user1 = userMapper.toEntity(user);
        User addUser = userRepository.save(user1);

        return userMapper.toResponse(addUser);
    }

}
