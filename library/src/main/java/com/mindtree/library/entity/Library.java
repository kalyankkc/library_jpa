package com.mindtree.library.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Library {
    @Id
	private int libraryId;
	private String libraryName;
	private String libraryAddress;
	

	@ManyToMany(cascade=CascadeType.ALL)
	/*@JoinTable(
			  name = "library_users", 
			  joinColumns = @JoinColumn(name = "libraryId"), 
			  inverseJoinColumns = @JoinColumn(name = "userId"))*/
	List<User> users;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int libraryId, String libraryName, String libraryAddress) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
	}	

	public Library(int libraryId, String libraryName, String libraryAddress, List<User> users) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.users = users;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	 @JsonIgnoreProperties("libraries")
	public List<User> getUsers() {
		return users;
	}
    @JsonIgnoreProperties("libraries")
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}
