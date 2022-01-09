package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.BidService;
import com.umutyildiz.Bas.dataAccess.abstracts.BidDao;
import com.umutyildiz.Bas.entities.concretes.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidDao bidDao;

    @Override
    public void createBid(Bid bid) {
        try{
            bidDao.save(bid);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
