package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.RatingService;
import com.umutyildiz.Bas.dataAccess.abstracts.RatingDao;
import com.umutyildiz.Bas.entities.concretes.Rating;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingDao ratingDao;


   /* @Override
    public List<Rating> getByRaterUser(User raterUser) {
        //return ratingDao.getByRaterUser(raterUser);
    }*/

    @Override
    public void createRating(Rating rating) {
        try{
            ratingDao.save(rating);
        }catch (Exception e){
            System.out.println("hata var..." + e.getMessage());
        }

    }

}
