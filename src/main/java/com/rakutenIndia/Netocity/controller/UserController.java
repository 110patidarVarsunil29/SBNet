package com.rakutenIndia.Netocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakutenIndia.Netocity.DTO.UserDTO;
import com.rakutenIndia.Netocity.service.IUserService;

@RestController

public class UserController {

	@Autowired
	IUserService userService;
	
	@GetMapping("/userList")
	public List<UserDTO>index() {
		return userService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public UserDTO findUserById(@PathVariable(name="id") long empId)
	{
		return userService.findById(empId);
	}
	//create user
	@PostMapping("/createUser")
	public UserDTO saveUser(@RequestBody UserDTO user)
	{
		return userService.saveUser(user);
	}
	//update user
	@PutMapping("/user/{id}")
	public UserDTO updateUser(@RequestBody UserDTO user, @PathVariable("id") long empId) 
	{
			return this.userService.updateUser(user,empId);
	}
	//delete user
	@DeleteMapping("/user/{id}")
	public ResponseEntity<UserDTO> deleteUser (@PathVariable("id") long empId){
		return this.userService.deleteUser(empId);
	}
}
