package com.mindtree.library.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.entity.User;
import com.mindtree.library.repository.UserRepository;
import com.mindtree.library.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userrepo;

	public User addUser(User user) {
         
		
		return userrepo.save(user);
	}

	public User getUserWithId(int userId) {
		
		
		Optional<User> temp=userrepo.findById(userId); 
		return temp.get();
		
		
	
	}



	
	
	
}
