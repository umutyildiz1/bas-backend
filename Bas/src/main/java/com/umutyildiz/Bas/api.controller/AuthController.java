package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("handle")
    public ResponseEntity<?> handleAuth(@RequestHeader(name="Authorization" , required = false) String token){
        return authService.handleAuth(token);
    }

}
