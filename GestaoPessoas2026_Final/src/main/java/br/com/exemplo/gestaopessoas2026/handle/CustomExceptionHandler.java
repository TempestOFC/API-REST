
package br.com.exemplo.gestaopessoas2026.handle;
import br.com.exemplo.gestaopessoas2026.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.Date;
@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
 @ExceptionHandler(Exception.class)
 public final ResponseEntity<ExceptionResponse> generic(Exception ex, WebRequest req){
  return new ResponseEntity<>(new ExceptionResponse(new Date(),ex.getMessage(),req.getDescription(false)),HttpStatus.INTERNAL_SERVER_ERROR);}
 @ExceptionHandler(RequisicaoInvalidaException.class)
 public final ResponseEntity<ExceptionResponse> bad(RequisicaoInvalidaException ex, WebRequest req){
  return new ResponseEntity<>(new ExceptionResponse(new Date(),ex.getMessage(),req.getDescription(false)),HttpStatus.BAD_REQUEST);}
 @ExceptionHandler(AcessoNaoAutorizadoException.class)
 public final ResponseEntity<ExceptionResponse> unauth(AcessoNaoAutorizadoException ex, WebRequest req){
  return new ResponseEntity<>(new ExceptionResponse(new Date(),ex.getMessage(),req.getDescription(false)),HttpStatus.UNAUTHORIZED);}
}
