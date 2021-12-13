package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.UserService;
import com.umutyildiz.Bas.core.utilities.ApiError;
import com.umutyildiz.Bas.core.utilities.ResponseMessage;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user){
        user.setImageUrl("qwee");//silinecek
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("getUserById")
    public User getUserById(@RequestParam int id){
       return userService.getUserById(id);
    }
}
