package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.AuthService;
import com.umutyildiz.Bas.core.utilities.ApiError;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class AuthImpl implements AuthService {

    @Autowired
    UserDao userDao;

    @Override
    public ResponseEntity<?> handleAuth(String token) {
        if(token == null){
            ApiError apiError = new ApiError(401,"Unauthorized Request","/api/auth/");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(apiError);
        }

        String base64encoded = token.split("Basic ")[1];
        String decoded = new String(Base64.getDecoder().decode(base64encoded));
        String[] parts = decoded.split(":");
        String email = parts[0];
        String password = parts[1];
        User authUser = userDao.getByUserEmail(email);
        if(authUser == null){
            ApiError apiError = new ApiError(401,"Unauthorized Request","/api/auth/");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(apiError);
        }
        System.out.println(authUser.toString());
        return ResponseEntity.ok().build();
    }
}
