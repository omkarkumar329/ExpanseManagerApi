package com.omkar.expanseManagerApi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.expanseManagerApi.entity.User;
import com.omkar.expanseManagerApi.entity.UserModel;
import com.omkar.expanseManagerApi.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
     public ResponseEntity<User> Save(@Valid @RequestBody UserModel user)
     {
    	
    	 return new ResponseEntity<User>(userService.createUser(user),HttpStatus.CREATED);
     }
	
	

}
