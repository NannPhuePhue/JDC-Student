package com.jdc.tut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jdc.tut.LibException;
import com.jdc.tut.entity.User;
import com.jdc.tut.repository.UserRepo;


@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;

	public User findBylogin(String name, String pass) {
		
		if(StringUtils.isEmpty(name)) {
			throw new LibException("Please Type your login_id");
		}
		if(StringUtils.isEmpty(pass)) {
			throw new LibException("Please Type your password");
		}
		
		User user=repo.findByLoginId(name);
		
		
		if(user==null) {
			throw new LibException("Please Check your name");
		}
		if(!user.getPassword().equals(pass)) {
			throw new LibException("Please Check your password");
		}
		
		
		return user;
	}

	
}
