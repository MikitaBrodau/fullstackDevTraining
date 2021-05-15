package com.mbrodau.fullstack.amigoscode.practice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ApiRequestException extends RuntimeException {
    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message,
                               Throwable cause) {
        super(message, cause);
    }
}
