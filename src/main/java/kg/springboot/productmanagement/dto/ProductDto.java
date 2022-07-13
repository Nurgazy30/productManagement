package kg.springboot.productmanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private String productName;
    private Integer quantity;
    private Double price;
    private String description;
    private Long category_id;
}
