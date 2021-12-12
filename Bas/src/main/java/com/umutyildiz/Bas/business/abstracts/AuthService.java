package com.umutyildiz.Bas.business.abstracts;

import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity handleAuth(String token);
}
