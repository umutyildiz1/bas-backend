package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.RatingService;
import com.umutyildiz.Bas.entities.concretes.Rating;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/1.0/ratings/")
public class RatingController {
    @Autowired
    private RatingService ratingService;

   /* @GetMapping("getByRaterUser")
    public List<Rating> getByRaterUser(@RequestBody User raterUser){

        return ratingService.getByRaterUser(raterUser);
    }*/

    @PostMapping("createRating")
    public void createRating(@RequestBody Rating rating){
        ratingService.createRating(rating);
    }
}
