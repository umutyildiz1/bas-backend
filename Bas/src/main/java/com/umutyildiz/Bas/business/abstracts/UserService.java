package com.umutyildiz.Bas.business.abstracts;

import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.entities.concretes.User;

public interface UserService {
    User getUserById(int id);
    ResponseMessage createUser(User user);
}
