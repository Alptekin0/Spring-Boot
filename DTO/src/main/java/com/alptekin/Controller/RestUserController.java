package com.alptekin.Controller;

import com.alptekin.Dto.DtoUserRequest;
import com.alptekin.Dto.DtoUserResponse;
import com.alptekin.Entity.User;
import com.alptekin.Service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class RestUserController {

    private IUserService iUserService;

    public RestUserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/addUser")
    public DtoUserResponse addUser (@RequestBody DtoUserRequest user) {
        return iUserService.addUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<DtoUserResponse> getUsers() {
        return iUserService.getUsers();
    }


}
