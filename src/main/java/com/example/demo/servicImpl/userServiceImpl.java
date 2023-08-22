package com.example.demo.servicImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositorys.UserRepo;
import com.example.demo.entitys.User;
import com.example.demo.services.UserService;

import jakarta.websocket.Session;

@Service
public  class userServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	
	
	@Override
	public User AddUser(User user) {
		User Saveuser= userRepo.save(user);
		  
		return Saveuser;
	}

	
	  @Override 
	    public boolean login(User user) {
	        User entity = userRepo.findByuserName(user.getUserName());

	        if (entity != null && entity.getPassword().equals(user.getPassword()) && entity.getUserName().equals(user.getUserName())) {

      
	            return true; 
	        }

	        return false;
	    }
	
}
