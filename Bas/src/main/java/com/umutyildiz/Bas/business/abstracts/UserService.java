package com.umutyildiz.Bas.business.abstracts;

import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User getUserById(int id);
    ResponseMessage createUser(User user);
}
