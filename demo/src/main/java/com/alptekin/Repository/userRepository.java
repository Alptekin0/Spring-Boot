package com.alptekin.Repository;

import java.util.List; 

import org.springframework.stereotype.Repository;

import com.alptekin.config.users;
import com.alptekin.data.usersData;


@Repository
public class userRepository {
	
	
	private usersData usersData;
	
	public userRepository(usersData usersData) {
		this.usersData = usersData;
	}
	
	public List<users> getUsers() {
		return usersData.getUsers();
	}

}
