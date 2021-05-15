package com.rakutenIndia.Netocity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rakutenIndia.Netocity.DTO.UserDTO;

@Repository
public interface IUserDao extends JpaRepository<UserDTO, Long> {
	
	/*
	 * @Query("from employees order by empid desc") public UserDTO
	 * findByEmpIdSorted(long empId);
	 */
	 
}
