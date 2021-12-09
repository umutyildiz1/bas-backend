package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public ResponseMessage createUser(@RequestBody User user){
        user.setImageUrl("qwee");//silinecek
        return userService.createUser(user);

    }
    @GetMapping("getUserById")
    public User getUserById(@RequestParam int id){
       return userService.getUserById(id);
    }
}
