package com.umutyildiz.Bas.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "auction_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuctionImage {

    @EmbeddedId
    private AuctionImageId auctionImageId;


    @Size(min=0, max = 500)
    @Column(name = "image_url")
    private String imageUrl;

}
