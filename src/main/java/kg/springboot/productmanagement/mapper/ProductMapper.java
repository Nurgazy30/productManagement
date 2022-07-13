package kg.springboot.productmanagement.mapper;

import kg.springboot.productmanagement.dto.ProductDto;
import kg.springboot.productmanagement.model.Product;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "productName", target = "title")
    @Mapping(source = "category_id", target = "category.id")
    Product toProduct(ProductDto productDto);

    @InheritInverseConfiguration
    ProductDto toProductDto(Product product);
}
