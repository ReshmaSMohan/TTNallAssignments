package springsession.restwithspring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.Date;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception exception, WebRequest webRequest){
        CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse(new Date(),exception.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity(customExceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public final ResponseEntity<Object> studentNotFoundException(StudentNotFoundException studException, WebRequest webRequest){
        CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse(new Date(),studException.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity(customExceptionResponse,HttpStatus.NOT_FOUND);
    }

}
