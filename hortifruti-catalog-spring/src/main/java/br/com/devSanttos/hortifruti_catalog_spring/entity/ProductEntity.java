package br.com.devSanttos.hortifruti_catalog_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private Double price;

    private BigDecimal promoPrice;
    private LocalDate promoStart;
    private LocalDate promoEnd;

    @Column(nullable = false)
    private Boolean active = true;

    @Column(length = 255)
    private String imageUrl;

    //realizar no create
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    //realizar no update
    private LocalDateTime updatedAt;

    //realizar no create
    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false, updatable = false)
    private AdminEntity createdBy;

    //realizar no update
    @ManyToOne
    @JoinColumn(name = "updated_by")
    private AdminEntity updatedBy;
}
