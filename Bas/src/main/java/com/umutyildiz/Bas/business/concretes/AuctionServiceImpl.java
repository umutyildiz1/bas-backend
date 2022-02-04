package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.AuctionService;
import com.umutyildiz.Bas.dataAccess.abstracts.AuctionDao;
import com.umutyildiz.Bas.entities.concretes.Auction;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    private AuctionDao auctionDao;

    public void createAuction(Auction auction){
        try{
            auctionDao.save(auction);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Auction> getAuctionByUser(int userId) {
        return auctionDao.GetAuctionByUser(userId);
    }

    @Override
    public List<Auction> getAll() {
        return auctionDao.findAll();
    }

}
