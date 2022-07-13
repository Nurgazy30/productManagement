package kg.springboot.productmanagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Integer quantity;
    private Double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;
}
