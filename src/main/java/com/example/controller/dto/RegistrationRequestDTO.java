package com.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegistrationRequestDTO {
    // abc@
    @Email
    @Length(max = 50, min = 8)      // true/false
    @NotBlank                       // true/false
    // all-in-one-annotation        // true/false
    private String email;

    @NotNull
    private String password;

    @Past
    @NotNull
    private LocalDate dateOfBirth;

    @Min(1)
    @Max(5)
    @NotNull
    private Integer rating;
}
