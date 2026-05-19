package com.alptekin.Controller;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Service.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class RestUserController {

    private final IUserService iUserService;

    @PostMapping("/addUser")
    public DtoUserResponse addUser(@RequestBody @Valid DtoUserRequest user) {
        return iUserService.addUser(user);
    }

}
