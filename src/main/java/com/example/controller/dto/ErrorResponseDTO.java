package com.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ErrorResponseDTO {

    private HttpStatus status;
    private int statusCode;

    private String message;

    private Object errors;

}
