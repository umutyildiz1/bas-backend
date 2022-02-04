package com.umutyildiz.Bas.business.abstracts;

import com.umutyildiz.Bas.entities.concretes.Auction;
import com.umutyildiz.Bas.entities.concretes.User;

import java.util.List;

public interface AuctionService {
    void createAuction(Auction auction);
    List<Auction> getAuctionByUser(int userId);
    List<Auction> getAll();
}
