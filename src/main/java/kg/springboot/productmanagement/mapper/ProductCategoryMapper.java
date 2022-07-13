package kg.springboot.productmanagement.mapper;

import kg.springboot.productmanagement.dto.ProductCategoryDto;
import kg.springboot.productmanagement.model.ProductCategory;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {

    @Mapping(source = "categoryName", target = "title")
    @Mapping(source = "categoryDesc", target = "description")
    ProductCategory toProductCategory(ProductCategoryDto productCategoryDto);

    @InheritInverseConfiguration
    ProductCategoryDto toProductCategoryDto(ProductCategory productCategory);
}
