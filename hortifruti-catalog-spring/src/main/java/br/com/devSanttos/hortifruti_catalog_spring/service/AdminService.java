package br.com.devSanttos.hortifruti_catalog_spring.service;

import br.com.devSanttos.hortifruti_catalog_spring.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
}
