package com.rakutenIndia.Netocity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rakutenIndia.Netocity.DTO.UserDTO;
import com.rakutenIndia.Netocity.dao.IUserDao;
import com.rakutenIndia.Netocity.exception.ResourceNotFoundException;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserDao iUserDao;
	
	public List<UserDTO> findAll(){
		return iUserDao.findAll();
	}
	public UserDTO findById(long empId){
		return this.iUserDao.findById(empId).orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + empId));
	}
	public UserDTO saveUser(UserDTO user) {
		return this.iUserDao.save(user);
	}
	public UserDTO updateUser(UserDTO user, long empId) {
		UserDTO existingUser= iUserDao.findById(empId).orElseThrow (() -> new ResourceNotFoundException("User not found with id :" + empId));
        existingUser.setEmpName(user.getEmpName());
        existingUser.setdName(user.getdName());
        existingUser.setEmail(user.getEmail());
        return this.iUserDao.save(existingUser);
	}
	@Override
	public ResponseEntity<UserDTO> deleteUser(long empId) {
		UserDTO user= this.iUserDao.findById(empId).orElseThrow (() -> new ResourceNotFoundException("User not found with id :" + empId));
		this.iUserDao.delete(user);
		return ResponseEntity.ok().build();
	}
}
