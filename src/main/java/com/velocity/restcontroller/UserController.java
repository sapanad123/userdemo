package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.dto.ResponseDto;
import com.velocity.service.UserService;
import com.velocity.user.User;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// save
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1 = userService.savUser(user);
		return user1;
	}

	// get
	@GetMapping("/getUser/{id}")
	public ResponseDto getUserResponse(@PathVariable("id") Integer id) {
		ResponseDto responseDto = userService.getUser(id);
		return responseDto;
	}
}
