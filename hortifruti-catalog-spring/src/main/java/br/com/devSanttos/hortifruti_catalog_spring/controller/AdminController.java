package br.com.devSanttos.hortifruti_catalog_spring.controller;

import br.com.devSanttos.hortifruti_catalog_spring.dto.AdminDto;
import br.com.devSanttos.hortifruti_catalog_spring.dto.AuthRequestDto;
import br.com.devSanttos.hortifruti_catalog_spring.entity.AdminEntity;
import br.com.devSanttos.hortifruti_catalog_spring.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://127.0.0.1:5500"})
@RequestMapping("/admin/gest-hortifruti")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping
    @RequestMapping("/save")
    public ResponseEntity<Object> saveAdmin(@RequestBody @Valid AdminDto adminDto) {
        var adminEntity = new AdminEntity();
        BeanUtils.copyProperties(adminDto, adminEntity);
        adminEntity.setCreatedAt(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        adminService.save(adminEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Admin created!");
    }

    @PostMapping
    @RequestMapping("/auth")
    public ResponseEntity<Object> autenticaAdmin(@RequestBody @Valid AuthRequestDto authRequestDto) {
        Optional<AdminEntity> adminEntityOptional = adminService.findByLogin(authRequestDto.getLogin());
        if (!adminEntityOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Login not found!");
        }

        if(!adminEntityOptional.get().getPassword().equals(authRequestDto.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Wrong password!");
        }
        adminEntityOptional.get().setLastLogin(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return ResponseEntity.status(HttpStatus.OK).body("Login successful!");
    }
}
