package kg.springboot.productmanagement.service;

import kg.springboot.productmanagement.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();

    Optional<Product> getProduct(Long id);

    Product updateProduct(Long id, Product product);

    Product createProduct(Product product);

    void deleteProduct(Long id);
}
