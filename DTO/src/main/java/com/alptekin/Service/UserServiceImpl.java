package com.alptekin.Service;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import com.alptekin.Mapper.UserMapper;
import com.alptekin.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    private UserRepository userRepository;
    private UserMapper userMapper;


    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public DtoUserResponse addUser(DtoUserRequest user) {

        User newUser = userMapper.toEntity(user);
        User savedUser = userRepository.save(newUser);

        return userMapper.toResponse(savedUser);
    }

    @Override
    public List<DtoUserResponse>  getUsers() {

        List<User> users = userRepository.findAll();
        List<DtoUserResponse> responses = new ArrayList<>();

        for (User user : users) {
            responses.add(userMapper.toResponse(user));
        }

        return responses;
    }

}
