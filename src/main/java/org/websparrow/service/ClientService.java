package org.websparrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.websparrow.dao.ClientDAO;
import org.websparrow.entity.Clientes;

@Service
public class ClientService {

	   @Autowired
    private ClientDAO clientDAO;

    public List<Clientes> get() {
        return clientDAO.getAllClients();
    }

    public Clientes save(Clientes client) {
        return clientDAO.saveClient(client);
    }

    public void delete(int id) {
        clientDAO.deleteClient(id);
    }
}