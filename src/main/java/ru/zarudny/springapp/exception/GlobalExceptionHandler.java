package ru.zarudny.springapp.exception;

import javax.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler({EntityNotFoundException.class})
  public ErrorResponse handleEntityNotFoundException(EntityNotFoundException ex) {
    log.error("Entity exception, bad request: {}", ex.getMessage());
    return ErrorResponse.builder()
        .message("Person not exist")
        .build();
  }
}
