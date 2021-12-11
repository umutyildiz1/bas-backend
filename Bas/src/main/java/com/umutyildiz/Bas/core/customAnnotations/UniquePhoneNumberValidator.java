package com.umutyildiz.Bas.core.customAnnotations;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniquePhoneNumberValidator implements ConstraintValidator<UniquePhoneNumber,String> {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        User user = userDao.getByUserPhoneNumber(s);
        if(user != null){
            return false;
        }
        return true;
    }
}
