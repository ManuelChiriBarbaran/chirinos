package examenparcial.chirinos.exception.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public String manejarExcepcion(RuntimeException ex) {
        return "Error: " + ex.getMessage();
    }
}
