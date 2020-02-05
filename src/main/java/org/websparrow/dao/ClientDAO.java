package org.websparrow.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Clientes;
import org.websparrow.repository.ClientRepository;

@Repository
public class ClientDAO {

	@Autowired
	private ClientRepository clientsRepository;

	public List<Clientes> getAllClients() {
		return clientsRepository.findAll();
	}

	public Clientes saveClient(Clientes client) {
		return clientsRepository.save(client);
	}

	public void deleteClient(int id) {
		clientsRepository.deleteById(id);
	}
}