package com.alptekin.Controller;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Service.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class RestUserController {

    private final IUserService iUserService;

    @GetMapping("/getUserById")
    public DtoUserResponse getUserById(@RequestParam(name = "id") Integer id) {
        return iUserService.getUserById(id);
    }

    @PostMapping("/addUser")
    public DtoUserResponse addUser(@RequestBody @Valid DtoUserRequest user) {
        return iUserService.addUser(user);
    }


}
