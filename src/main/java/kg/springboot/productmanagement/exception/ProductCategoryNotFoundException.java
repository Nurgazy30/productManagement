package kg.springboot.productmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductCategoryNotFoundException extends RuntimeException{

    public ProductCategoryNotFoundException() {super();}

    public ProductCategoryNotFoundException(String message) { super(message);}
}
