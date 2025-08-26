package br.com.devSanttos.hortifruti_catalog_spring.repository;

import br.com.devSanttos.hortifruti_catalog_spring.entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity, UUID> {
}
