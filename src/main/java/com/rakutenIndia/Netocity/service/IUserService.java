package com.rakutenIndia.Netocity.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rakutenIndia.Netocity.DTO.UserDTO;

public interface IUserService {

	public List<UserDTO> findAll();
	public UserDTO findById(long empId);
	public UserDTO saveUser(UserDTO user);
	public UserDTO updateUser(UserDTO user, long empId);
	public ResponseEntity<UserDTO> deleteUser(long empId);
}
