package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteUserId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "favorited_user_id")
    private User favoritedUser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteUserId that = (FavoriteUserId) o;
        return Objects.equals(user, that.user) && Objects.equals(favoritedUser, that.favoritedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, favoritedUser);
    }
}
