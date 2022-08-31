package com.omkar.expanseManagerApi.service;

import com.omkar.expanseManagerApi.entity.User;
import com.omkar.expanseManagerApi.entity.UserModel;

public interface UserService {
	
     User createUser(UserModel user);
}
