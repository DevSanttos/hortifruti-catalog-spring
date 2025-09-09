package br.com.devSanttos.hortifruti_catalog_spring.service;

import br.com.devSanttos.hortifruti_catalog_spring.entity.ProductEntity;
import br.com.devSanttos.hortifruti_catalog_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    private ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    private List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    private ProductEntity findByName(String name) {
        return productRepository.findByName(name);
    }

    private ProductEntity findByDescription(String description) {
        return productRepository.findByDescription(description);
    }

    private ProductEntity findByPrice(Double price) {
        return productRepository.findByPrice(price);
    }

    private void delete(ProductEntity productEntity) {
        productRepository.delete(productEntity);
    }

    private void deleteById(UUID id) {
        productRepository.deleteById(id);
    }
}
