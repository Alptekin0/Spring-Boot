package com.alptekin.Controller;

import com.alptekin.Dto.UserDtoRequest;
import com.alptekin.Dto.UserDtoResponse;
import com.alptekin.Entity.User;
import com.alptekin.Service.IUserService;
import com.alptekin.Service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class RestUserController {

    private final IUserService iUserService;

    @PostMapping("/addUser")
    public UserDtoResponse addUser(@RequestBody UserDtoRequest user) {
        return iUserService.addUser(user);
    }



}
