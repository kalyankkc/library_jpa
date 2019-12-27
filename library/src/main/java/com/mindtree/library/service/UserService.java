package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.entity.Library;
import com.mindtree.library.entity.User;

public interface UserService {

	User addUser(User user);

	User getUserWithId(int userId);

	//List<User> getUserWithId(int userId);

}
