package com.omkar.expanseManagerApi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.expanseManagerApi.entity.User;
import com.omkar.expanseManagerApi.entity.UserModel;
import com.omkar.expanseManagerApi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(UserModel uModel) {
		// TODO Auto-generated method stub
		User user= new User();
		BeanUtils.copyProperties(uModel, user);
		
		return userRepository.save(user);
		
	}

}
