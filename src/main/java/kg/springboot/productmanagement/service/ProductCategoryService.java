package kg.springboot.productmanagement.service;

import kg.springboot.productmanagement.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> getAllCategory();

    ProductCategory getProductCategory(Long id);

    ProductCategory updateProductCategory(Long id, ProductCategory productCategory);

    ProductCategory createProductCategory(ProductCategory productCategory);

    void deleteProductCategory(Long id);

}
