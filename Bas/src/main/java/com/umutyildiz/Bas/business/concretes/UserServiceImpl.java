package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getUserById(int id) {

        return userDao.getByUserId(id);
    }

    @Override
    public ResponseMessage createUser(User user) {
        userDao.save(user);
        return new ResponseMessage("Kullanıcı eklendi");
    }
}
