package com.mbrodau.fullstack.amigoscode.practice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Data
public final class ApiExceptionInformation {
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;
}
