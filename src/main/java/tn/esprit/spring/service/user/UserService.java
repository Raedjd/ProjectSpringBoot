package tn.esprit.spring.service.user;

import java.util.List;

import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;


public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}