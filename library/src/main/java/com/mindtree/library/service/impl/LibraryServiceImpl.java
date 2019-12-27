package com.mindtree.library.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.mindtree.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.entity.Library;
import com.mindtree.library.repository.LibraryRepository;
import com.mindtree.library.repository.UserRepository;
import com.mindtree.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements  LibraryService {
	@Autowired  
	LibraryRepository librepo;
	
	@Autowired
	UserRepository userrepo;

	public Library addLibrary(Library library) {
		
		
		 List<Library> libraries=new ArrayList<Library>();
		
		 libraries.add(library);
		 
		 library.getUsers().forEach(i->i.setLibraries(libraries));
		
		 //
	/*	List<User>users =library.getUsers();
	for (User user : users) {
			library.getUsers().add(user);
			
		}*/
	    //userrepo.saveAll(users);
	
	    librepo.save(library);
		
		
		
		
		return library;
		
	}

	public List<Library> getLibrary() {
		List<Library> libraries=librepo.findAll();
		
		
		
		return libraries;
	}

	public List<Library> getLibrariesWith() {
		List<Library> libraries=librepo.findAll();
		 
		List<Library> result=new ArrayList<Library>();
		for (Library library : libraries) {
			
			if(library.getUsers().size()<2)
			{
				result.add(library);
			}
		}
		return result;
	}

}
