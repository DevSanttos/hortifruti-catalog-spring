package br.com.devSanttos.hortifruti_catalog_spring.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductDto {
    private String name;
    private String description;
    private Double price;
    private BigDecimal promoPrice;
    private LocalDate promoStart;
    private LocalDate promoEnd;
    private Boolean active;
    private String imageUrl;
}
