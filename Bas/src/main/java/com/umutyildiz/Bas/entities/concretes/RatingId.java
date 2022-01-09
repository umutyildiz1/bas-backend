package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingId implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "rater_user_id", nullable = false)
    private User raterUser;

    @ManyToOne()
    @JoinColumn(name = "rated_user_id", nullable = false)
    private User ratedUser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingId ratingId = (RatingId) o;
        return Objects.equals(raterUser, ratingId.raterUser) && Objects.equals(ratedUser, ratingId.ratedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raterUser, ratedUser);
    }
}
