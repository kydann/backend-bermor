package org.websparrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Clientes;

@Repository
public interface ClientRepository extends JpaRepository<Clientes, Integer> {

}

