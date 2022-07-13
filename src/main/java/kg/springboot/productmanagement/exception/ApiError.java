package kg.springboot.productmanagement.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
public class ApiError {

    private int code;

    private String status;

    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;


    public ApiError(HttpStatus status, String message){
        this.status = status.name();
        this.code = status.value();
        this.message = message;
        this.timestamp = new Date();
    }
}
