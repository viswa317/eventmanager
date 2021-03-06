package com.poj.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRespository; 
	
	@RequestMapping(method=RequestMethod.GET)
	  public List<User> getAll() {
	    return userRespository.findAll();
	 }
	
}
