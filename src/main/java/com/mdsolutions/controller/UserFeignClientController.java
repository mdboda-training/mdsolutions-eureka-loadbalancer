package com.mdsolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdsolutions.dto.UserDto;
import com.mdsolutions.feign.UserFeignClient;

@RestController
public class UserFeignClientController {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/feign/loadUser")
	public UserDto feignClientLoadUser(@RequestParam Integer userId) {
		return userFeignClient.getUsers(userId);
	}
	
	@GetMapping("/feign/loadAllUsers")
	public List<UserDto> feignClientLoanAllUsers() {
		return userFeignClient.getUsers();
	}
	
}
