package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "favorite_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteUser {

    @EmbeddedId
    private FavoriteUserId favoriteUserId;

    @NotBlank
    @Column(name = "is_favorite_user")
    private boolean isFavoriteUser;


}
