package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entitys.User;

@Service
public interface UserService {
	
	public User AddUser(User user);

	boolean login(User user);

}
