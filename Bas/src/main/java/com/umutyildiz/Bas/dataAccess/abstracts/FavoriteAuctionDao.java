package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.FavoriteAuction;
import com.umutyildiz.Bas.entities.concretes.FavoriteAuctionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteAuctionDao extends JpaRepository<FavoriteAuction, FavoriteAuctionId> {
}
