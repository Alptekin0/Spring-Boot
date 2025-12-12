package com.alptekin.Controller;

import java.util.List; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alptekin.Service.userService;
import com.alptekin.config.users;

@RestController
public class userController {
	
	private userService userService;
	
	public userController(userService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping(path = "/getUsers")
	@ResponseBody
	public List<users> getUsers() {
		return userService.getUsers();
	}
	
	
	@GetMapping(path = "/getUser/{id}")
	public users getUsersById(@PathVariable int id) {
		
		return userService.getUsersById(id);
	}
	
}
