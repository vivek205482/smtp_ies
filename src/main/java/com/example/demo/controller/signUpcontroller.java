package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitys.User;
import com.example.demo.servicImpl.userServiceImpl;
import com.example.demo.services.UserService;

@RestController
public class signUpcontroller {
	
	@Autowired
	UserService userservice;
	
//	@RequestMapping("/signUp")

	
	 @PostMapping("/signup")
    public ResponseEntity<String> addUser(@RequestBody User user) { 
        
		User SaveUser=userservice.AddUser(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }
		
     @PostMapping("/login")
	 public ResponseEntity<String> getUser(@RequestBody User user) {
        
			boolean SaveUser=userservice.login(user);
			
			if(SaveUser) {
			
        return new ResponseEntity<>("Login successfully", HttpStatus.ACCEPTED);
			}else {
				 return new ResponseEntity<>("incorrect credencial", HttpStatus.NOT_FOUND);
			}
	    }
	
	

	
}
