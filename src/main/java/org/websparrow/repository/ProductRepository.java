package org.websparrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Object>{
    
}
