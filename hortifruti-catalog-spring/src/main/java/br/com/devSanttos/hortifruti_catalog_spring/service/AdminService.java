package br.com.devSanttos.hortifruti_catalog_spring.service;

import br.com.devSanttos.hortifruti_catalog_spring.entity.AdminEntity;
import br.com.devSanttos.hortifruti_catalog_spring.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public AdminEntity save(AdminEntity adminEntity) {
        return adminRepository.save(adminEntity);
    }

    public Optional<AdminEntity> findByLogin(String login) {
        return adminRepository.findByLogin(login);
    }


}
