package com.alptekin.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alptekin.config.users;


@Configuration
public class usersData {
	
	List<users> user = new ArrayList<users>();
	
	public usersData() {
		user.add(new users(1, "Azmi", "Ceviz"));
		user.add(new users(2, "Fevzi", "Hurma"));
		user.add(new users(3, "Cemal", "Üzüm"));
		user.add(new users(4, "Hüsnü", "Nar"));
		user.add(new users(5, "Feyyaz", "Kaysı"));
		user.add(new users(6, "Hüsnü", "Sırık"));
		user.add(new users(7, "Nedim", "Sekengöz"));
		user.add(new users(8, "Sezgin", "Haşlama"));
	}
	
	
	@Bean
	public List<users> getUsers() {
	        return user;
	}
}
