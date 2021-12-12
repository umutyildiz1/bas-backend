package com.umutyildiz.Bas.core.Configuration;

import com.umutyildiz.Bas.dataAccess.abstracts.UserDao;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.getByUserEmail(s);
        if(user == null){
            throw new UsernameNotFoundException("User not found!");
        }
        return new BaSUserDetails(user);
    }
}
