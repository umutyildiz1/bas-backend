package com.umutyildiz.Bas.business.abstracts;

import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {
    ResponseEntity handleAuth(User user);
}
