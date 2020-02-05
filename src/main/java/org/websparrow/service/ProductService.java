package org.websparrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.websparrow.dao.ProductDAO;
import org.websparrow.entity.Producto;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Producto> get() {
        return productDAO.getAllProducts();
    }

    public Producto save(Producto product) {
        return productDAO.saveProduct(product);
    }

    public void delete(int id) {
        productDAO.deleteProduct(id);
    }

}
