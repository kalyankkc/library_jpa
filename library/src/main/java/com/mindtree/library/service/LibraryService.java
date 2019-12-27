package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.entity.Library;

public interface LibraryService {

	

	public Library addLibrary(Library library);

	public List<Library> getLibrary();

	public List<Library> getLibrariesWith();

}
