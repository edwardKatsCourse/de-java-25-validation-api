package com.example.controller;

import com.example.controller.dto.ErrorResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponseDTO getInputValidationErrorResponse(MethodArgumentNotValidException e) {
        // Field Error
        // Object Error


        // email -> @not blank
        // email -> @email
        // email -> @length

        // after
        // email: [@not blank, @email, @length]

        // Map<field, list<error messages>>
        Map<String, List<String>> errors = e.getFieldErrors().stream()
                .collect(
                        Collectors.groupingBy(
                                x -> x.getField(),
                                Collectors.mapping(
                                        y -> y.getDefaultMessage(),
                                        Collectors.toList())
                        ));

        log.warn(e.getMessage());

        return ErrorResponseDTO.builder()
                .message("Input validation error")
                .status(HttpStatus.BAD_REQUEST)
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .errors(errors)
                .build();
    }

}
