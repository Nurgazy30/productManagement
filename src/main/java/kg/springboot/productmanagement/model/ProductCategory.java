package kg.springboot.productmanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
}
