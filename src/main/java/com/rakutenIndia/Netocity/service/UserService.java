package com.rakutenIndia.Netocity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakutenIndia.Netocity.DTO.UserDTO;
import com.rakutenIndia.Netocity.dao.IUserDao;

@Service
public class UserService {
	
	@Autowired
	IUserDao iUserDao;
	
	public List<UserDTO> findAll(){
		return iUserDao.findAll();
	}

}
