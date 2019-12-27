package com.mindtree.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.library.entity.Library;
import com.mindtree.library.entity.User;
import com.mindtree.library.service.LibraryService;
import com.mindtree.library.service.UserService;

@RestController
public class LibraryManagmentController {
	@Autowired
	LibraryService libraryser;
	
	@Autowired 
	UserService userser;
	
	@PostMapping(path="/addLibrary")
	public Library addLibrary(@RequestBody Library library)
	{
		return libraryser.addLibrary(library);
		
	}
	
	@PostMapping(path="/addUser")
	public User addUser(@RequestBody User user)
	{
		return userser.addUser(user);
	}
	
	@GetMapping(path="/getLibrary")
	public List<Library> getLibrary(){
		return libraryser.getLibrary();
		
	}
	
	@GetMapping(path="/getLibrariesWith")
	public List<Library> getLibrariesWith()
	{
	
		return 	libraryser.getLibrariesWith();
		
	}
	
	@GetMapping(path="/getUserWithId/{userId}")
	public User getUserWithId(@PathVariable int userId)
	{
		return userser.getUserWithId(userId);
	}

}
