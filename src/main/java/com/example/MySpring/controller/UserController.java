package com.example.MySpring.controller;

//import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.MySpring.repo.UserRepo;
import com.example.MySpring.domain.User;



@RestController
@RequestMapping("/anirban")
public class UserController {
	
	@Autowired
	UserRepo rp;
	

@RequestMapping("/findall")

@ResponseBody

public List<User> findall(){
	return rp.findAll();
}
}
