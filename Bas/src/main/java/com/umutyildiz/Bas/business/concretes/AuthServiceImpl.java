package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.AuthService;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    UserDao userDao;

    @Override
    public ResponseEntity<?> handleAuth(User user) {
        return ResponseEntity.ok(user);

    }


}
