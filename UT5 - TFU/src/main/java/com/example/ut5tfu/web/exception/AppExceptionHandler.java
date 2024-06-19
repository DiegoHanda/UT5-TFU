package com.example.ut5tfu.web.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class AppExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<String> apiExceptionHandler(ApiException ex, WebRequest request) {
        return ResponseEntity
                .status(ex.getHttpStatus())
                .body(ex.getMessage());
    }

}
