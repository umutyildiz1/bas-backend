package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "favorite_auctions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteAuction implements Serializable {

    @EmbeddedId
    private FavoriteAuctionId favoriteAuctionId;

    @NotBlank
    @Column(name = "is_favorite_auction")
    private boolean isFavorite;
}
