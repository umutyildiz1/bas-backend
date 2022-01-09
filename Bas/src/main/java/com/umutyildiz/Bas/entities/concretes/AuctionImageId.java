package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuctionImageId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_images_id")
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionImageId that = (AuctionImageId) o;
        return id == that.id && Objects.equals(auction, that.auction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auction, id);
    }
}
