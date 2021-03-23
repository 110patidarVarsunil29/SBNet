package com.rakutenIndia.Netocity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakutenIndia.Netocity.DTO.UserDTO;

@Repository
public interface IUserDao extends JpaRepository<UserDTO, Long> {

}
