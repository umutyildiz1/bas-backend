package com.umutyildiz.Bas.dataAccess.abstracts;


import com.umutyildiz.Bas.entities.concretes.Rating;
import com.umutyildiz.Bas.entities.concretes.RatingId;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingDao extends JpaRepository<Rating, RatingId> {

}
