package org.websparrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.websparrow.dao.UserDAO;
import org.websparrow.entity.Usuarios;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public List<Usuarios> get() {
		return userDAO.getAllUsers();
	}

	public Usuarios save(Usuarios user) {
		return userDAO.saveUser(user);
	}

	public void delete(int id) {
		userDAO.deleteUser(id);
	}
}
