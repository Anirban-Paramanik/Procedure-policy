package com.example.MySpring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MySpring.domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
}
