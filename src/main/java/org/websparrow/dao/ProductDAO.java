package org.websparrow.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Producto;
import org.websparrow.repository.ProductRepository;

@Repository
public class ProductDAO {

    @Autowired
    private ProductRepository productRepository;

    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    public Producto saveProduct(Producto producto) {
        return productRepository.save(producto);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

}
