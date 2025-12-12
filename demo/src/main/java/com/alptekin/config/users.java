package com.alptekin.config;

public class users {
	
	private int Id;
	private String name;
	private String surname;
	
   public users(int id, String name, String surname) {
	    this.Id = id;
	    this.name = name;
	    this.surname = surname;
	}
	
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
