package com.velocity.service;

import com.velocity.dto.ResponseDto;
import com.velocity.user.User;

public interface UserService {

	//save user
	public User savUser(User user);
	//get user
	public ResponseDto getUser(int id);
}
