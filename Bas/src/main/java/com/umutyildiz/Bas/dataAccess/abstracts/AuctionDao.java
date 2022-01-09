package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionDao extends JpaRepository<Auction,Integer> {
}
