package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.Auction;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuctionDao extends JpaRepository<Auction,Integer> {
    @Query("from Auction where user.userId =:userId")
    List<Auction> GetAuctionByUser(int userId);
}
