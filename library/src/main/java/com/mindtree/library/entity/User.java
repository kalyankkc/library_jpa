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
public class User {

	@Id
	private int userId;
	private String userName;
	private String address;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "users")
	/*
	 * @JoinTable( name = "library_users", joinColumns = @JoinColumn(name =
	 * "userId"), inverseJoinColumns = @JoinColumn(name = "libraryId"))
	 */

	List<Library> libraries;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}

	public User(int userId, String userName, String address, List<Library> libraries) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.libraries = libraries;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonIgnoreProperties("users")
	public List<Library> getLibraries() {
		return libraries;
	}

	@JsonIgnoreProperties("users")
	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}
}
