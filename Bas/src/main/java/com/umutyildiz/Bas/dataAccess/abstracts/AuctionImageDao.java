package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.AuctionImage;
import com.umutyildiz.Bas.entities.concretes.AuctionImageId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionImageDao extends JpaRepository<AuctionImage, AuctionImageId> {
}
