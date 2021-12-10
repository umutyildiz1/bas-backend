package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.core.utilities.ApiError;
import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getUserById(int id) {

        return userDao.getByUserId(id);
    }

    @Override
    public ResponseEntity<?> createUser(User user) {
        ApiError error = new ApiError(400,"Validation error","/users/createUser");
        Map<String, String> validationErrors = new HashMap<>();
        if(user.getName() == null || user.getName().isEmpty()){
            validationErrors.put("userName","Name can not be null");
        }
        if (user.getSurname() == null || user.getSurname().isEmpty()){
            validationErrors.put("userSurname","Surname can not be null");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()){
            validationErrors.put("userEmail","Email can not be null");
        }
        if(user.getPassword() == null || user.getPassword().isEmpty()){
            validationErrors.put("userPassword", "Password can not be null");
        }
        if(user.getPhoneNumber() == null || user.getPhoneNumber().isEmpty()){
            validationErrors.put("userPhoneNumber","Phone number can not be null");
        }

        if(validationErrors.size() > 0){
            error.setValidationErrors(validationErrors);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }

        userDao.save(user);
        return ResponseEntity.ok(new ResponseMessage("Kullanıcı eklendi"));
    }

}
