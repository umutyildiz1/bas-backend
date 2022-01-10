package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.AuctionService;
import com.umutyildiz.Bas.entities.concretes.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/auctions/")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping("createAuction")
    public void createAuction(@RequestBody Auction auction){
        auctionService.createAuction(auction);
    }
}
