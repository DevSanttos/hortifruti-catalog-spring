package br.com.devSanttos.hortifruti_catalog_spring.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProductDto {
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private Double price;
    private BigDecimal promoPrice;
    private LocalDate promoStart;
    private LocalDate promoEnd;
    private String imageUrl;
}
