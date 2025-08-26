package br.com.devSanttos.hortifruti_catalog_spring.service;

import br.com.devSanttos.hortifruti_catalog_spring.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {
    @Autowired
    private SubscriberRepository subscriberRepository;
}
