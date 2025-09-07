package br.com.devSanttos.hortifruti_catalog_spring.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequestDto {
    @NotBlank
    private String login;
    @NotBlank
    private String password;
}
