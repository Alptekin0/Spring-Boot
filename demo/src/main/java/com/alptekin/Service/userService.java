package com.alptekin.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alptekin.Repository.userRepository;
import com.alptekin.config.users;

@Service
public class userService {
	
	private userRepository userRepository;
	
	public userService(userRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<users> getUsers(){
		List<users> users = userRepository.getUsers();
		return users;
	}
	
	public users getUsersById(int id){
		List<users> users = userRepository.getUsers();
		
		if (id < 0) {
			 throw new IllegalArgumentException("ID 0 veya negatif olamaz");
		}
		
		users findUser = null;
		
		for (users user : users) {
			if (id == user.getId()) {
				findUser = user;
				break;
			}
		}
		
		if (findUser == null) {
			throw new RuntimeException("User not found");
		}
		
		return findUser;
	}
	
}