package kg.springboot.productmanagement.service;

import kg.springboot.productmanagement.model.ProductCategory;
import kg.springboot.productmanagement.repository.ProductCategoryRepository;
import kg.springboot.productmanagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> getAllCategory() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory getProductCategory(Long id) {
        return productCategoryRepository.findById(id)
                .orElse(null);
    }

    @Override
    public ProductCategory updateProductCategory(Long id, ProductCategory productCategory) {

        ProductCategory productCategoryFromDb = productCategoryRepository.findById(id)
                .orElse(null);

        productCategoryRepository.save(productCategoryFromDb);

        return productCategoryFromDb;
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public void deleteProductCategory(Long id) {
        productCategoryRepository.deleteById(id);

    }
}
