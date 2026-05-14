package com.alptekin.Service;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import com.alptekin.Handler.ResourceNotFoundException;
import com.alptekin.Mapper.UserMapper;
import com.alptekin.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public DtoUserResponse getUserById(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return userMapper.toResponse(user);
    }

    @Override
    public DtoUserResponse addUser(DtoUserRequest user) {
        User getUser = userMapper.toEntity(user);
        User savedUser = userRepository.save(getUser);
        return userMapper.toResponse(savedUser);
    }
}
