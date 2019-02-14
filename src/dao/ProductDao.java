package dao;

import domain.Product;

public interface ProductDao {
    boolean saveProduct(Product product);
    boolean deleteProduct(Product product);
}
