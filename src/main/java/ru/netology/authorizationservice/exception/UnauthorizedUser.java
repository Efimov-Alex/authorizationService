package ru.netology.authorizationservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        System.out.println(msg);
        //  super(msg);
        ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(msg);
    }
}