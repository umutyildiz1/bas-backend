package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.core.utilities.ApiError;
import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder){
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User getUserById(int id) {

        return userDao.getByUserId(id);
    }

    @Override
    public ResponseMessage createUser(User user) {
        user.setUserPassword(this.passwordEncoder.encode(user.getUserPassword()));
        userDao.save(user);
        return new ResponseMessage("Kullanıcı eklendi");
    }

}
