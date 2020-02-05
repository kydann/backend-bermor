package org.websparrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Usuarios;

@Repository
public interface UserRepository extends JpaRepository<Usuarios, Integer> {

}
