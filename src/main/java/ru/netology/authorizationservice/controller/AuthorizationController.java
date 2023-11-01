package ru.netology.authorizationservice.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.authorizationservice.Authorities;
import ru.netology.authorizationservice.model.User;
import ru.netology.authorizationservice.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        System.out.println(user.getUser());
        System.out.println(user.getPassword());
        return service.getAuthorities(user);
    }
}

// http://localhost:8080/authorize?user=Manager1&password=fjksbxc64gg
//{"user":"Admin1","password":"fh4krhf"}