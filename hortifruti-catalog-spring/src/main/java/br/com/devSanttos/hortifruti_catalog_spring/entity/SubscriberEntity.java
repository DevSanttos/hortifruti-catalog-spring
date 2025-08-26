package br.com.devSanttos.hortifruti_catalog_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_subscriber")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

//    confirmação para receber email
    @Column(nullable = false)
    private Boolean confirmed = false;

    private String confirmationToken;
    private LocalDateTime tokenExpiration;
    private LocalDateTime confirmedAt;
    private LocalDateTime unsubscribedAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
