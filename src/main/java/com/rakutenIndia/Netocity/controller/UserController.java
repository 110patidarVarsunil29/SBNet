package com.rakutenIndia.Netocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakutenIndia.Netocity.DTO.UserDTO;
import com.rakutenIndia.Netocity.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<UserDTO>index() {
		return userService.findAll();
	}
}
