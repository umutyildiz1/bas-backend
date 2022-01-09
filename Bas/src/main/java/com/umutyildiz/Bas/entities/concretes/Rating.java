package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@IdClass(Rating.class)
public class Rating {

    /*@Id
    @ManyToOne()
    @JoinColumn(name = "rater_user_id",nullable = false)
    private User raterUser;

    @Id
    @ManyToOne()
    @JoinColumn(name = "rated_user_id",nullable = false)
    private User ratedUser;*/

    @EmbeddedId
    private RatingId id;

    @NotBlank
    @Size(min = 0, max = 10)
    @Column(name = "value")
    private int value;
}

