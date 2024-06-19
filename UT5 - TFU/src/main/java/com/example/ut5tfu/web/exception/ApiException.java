package com.example.ut5tfu.web.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiException extends RuntimeException {

    protected final String message;
    protected final HttpStatus httpStatus;

    public ApiException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }
}
