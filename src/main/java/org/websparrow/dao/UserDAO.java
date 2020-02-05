package org.websparrow.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Usuarios;
import org.websparrow.repository.UserRepository;

@Repository
public class UserDAO {

	@Autowired
	private UserRepository usersRepository;

	public List<Usuarios> getAllUsers() {
		return usersRepository.findAll();
	}

	public Usuarios saveUser(Usuarios user) {
		return usersRepository.save(user);
	}

	public void deleteUser(int id) {
		usersRepository.deleteById(id);
	}
}
