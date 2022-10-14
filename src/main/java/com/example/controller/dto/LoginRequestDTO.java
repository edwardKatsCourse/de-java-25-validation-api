package com.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginRequestDTO {
    // String validation
    // null
    // empty -> str.length() == 0 -> ""
    // blank -> str.strip().length() == 0 -? " \t\n  "

    // name="email" type="VARCHAR(255)"

    // Top-level domain
    // 1st-level domain
    // .com

    // 2nd
    // |google| .com

    // 3rd
    // |translate|.google.com

    // sadnkadwqdkwqbhkqwdbjhwqdbjhqdwvbjhqdfwvujhqdfwwdasdasdsadsadsadsadsadsadasdasvbj@smnlkadssadadssadnksadsadasdasdadbnkadwbjkaxcbjksacbjkacebjkacebjk
    // ai@pb.pl

    @NotBlank
    @Email(message = "Email format is invalid")
    @Length(min = 8, max = 50) // -> varchar(50)
    private String email;

    @Length(min = 8, max = 25)
    // @Pattern(regex)
    @NotBlank
    private String password;

//    @Min(18)
//    private Integer age;
}

