package br.com.devSanttos.hortifruti_catalog_spring.controller;

import br.com.devSanttos.hortifruti_catalog_spring.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {
    @Autowired
    private SubscriberService subscriberService;
}
