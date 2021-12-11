package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User getByUserId(int id);
    User getByUserPhoneNumber(String userPhoneNumber);
    User getByUserEmail(String userEmail);
}
