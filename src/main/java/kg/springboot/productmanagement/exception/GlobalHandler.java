package kg.springboot.productmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> productNotFoundException(ProductNotFoundException exception) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        return new ResponseEntity<>(new ApiError(
                status, exception.getMessage()), status);
    }

    @ExceptionHandler(ProductCategoryNotFoundException.class)
    public ResponseEntity<?> productCategoryNotFoundException(ProductCategoryNotFoundException exception) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        return new ResponseEntity<>( new ApiError(
                status, exception.getMessage()
        ), status);
    }
}
