package com.techment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.techment.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	

	Optional<User> findByUserNameAndUserPassword(String e,String userPassword);
	User findByUserName(String userName);
	List<User> findAllByRole(String role);
	List<User> findAll();
	

}