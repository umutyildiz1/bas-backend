package com.umutyildiz.Bas.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "auctions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitiliazer","handler","bidList","auctionImages","favoriteAuctions"})
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_id")
    private int id;

    @Size(min=2,max=50)
    @NotBlank
    @Column(name = "auction_name")
    private String name;

    @Size(min=2,max=500)
    @NotBlank
    @Column(name = "description")
    private String description;

    /*@NotBlank
    @Column(name = "starting_date")
    @JsonFormat(shape=JsonFormat.Shape.OBJECT, pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp startingDate;*///Boray hocaya sor

    @Size(min=1,max=10)
    @NotBlank
    @Column(name = "starting_price")
    private double startingPrice;

    //eğer time ile başlatmak zor olursa isStarted ekle kullanıcı manuel olarak başlatabilir.

    @OneToMany(mappedBy = "auction")
    private List<Bid> bidList;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "auctionImageId.auction")
    private List<AuctionImage> auctionImages;

    @OneToMany(mappedBy = "favoriteAuctionId.auction")
    private List<FavoriteAuction> favoriteAuctions;
}
