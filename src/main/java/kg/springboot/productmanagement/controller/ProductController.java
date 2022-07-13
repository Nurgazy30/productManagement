package kg.springboot.productmanagement.controller;

import kg.springboot.productmanagement.dto.ProductCategoryDto;
import kg.springboot.productmanagement.dto.ProductDto;
import kg.springboot.productmanagement.exception.ProductNotFoundException;
import kg.springboot.productmanagement.mapper.ProductMapper;
import kg.springboot.productmanagement.model.Product;
import kg.springboot.productmanagement.model.ProductCategory;
import kg.springboot.productmanagement.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public List<ProductDto> getAllProducts() {

        return productService.getAllProducts()
                .stream()
                .map(productMapper::toProductDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable Long id){

        return productMapper.toProductDto(
                productService.getProduct(id).orElseThrow(
                        () -> new ProductNotFoundException()
                )
        );
    }

    @PostMapping
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        productService.createProduct(productMapper.toProduct(productDto));
        return productDto;
    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@PathVariable Long id,
                                    @RequestBody ProductDto productDto) {

        productService.updateProduct(id, productMapper.toProduct(productDto));
        return  productDto;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
