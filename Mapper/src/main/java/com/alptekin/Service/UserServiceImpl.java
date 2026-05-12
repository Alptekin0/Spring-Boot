package com.alptekin.Service;

import com.alptekin.Dto.UserDtoRequest;
import com.alptekin.Dto.UserDtoResponse;
import com.alptekin.Entity.User;
import com.alptekin.Mapper.UserMapper;
import com.alptekin.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDtoResponse addUser(UserDtoRequest user) {
        User newUser = userMapper.toEntity(user);
        User savedUser = userRepository.save(newUser);
        return userMapper.toDto(savedUser);
    }
}
