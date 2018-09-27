package com.example.arena.component;


import com.example.arena.exceptions.InvalidRequestException;
import com.example.arena.response.ApiError;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

  @Override
  protected ResponseEntity<Object> handleHttpMessageNotReadable(
      HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    String error = "Malformed JSON request";
    ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, error);
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }

  @ExceptionHandler(InvalidRequestException.class)
  protected ResponseEntity<Object> handleInvalidRequestException(
      InvalidRequestException ex) {
    ApiError arenaApiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getMessage());
    return new ResponseEntity<>(arenaApiError, arenaApiError.getStatus());
  }
}

