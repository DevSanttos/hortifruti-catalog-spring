package br.com.devSanttos.hortifruti_catalog_spring.repository;

import br.com.devSanttos.hortifruti_catalog_spring.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

    ProductEntity findByName(String name);
    void deleteById(UUID id);

    ProductEntity findByDescription(String description);

    ProductEntity findByPrice(Double price);
}
