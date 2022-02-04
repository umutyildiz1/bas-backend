package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.AuctionService;
import com.umutyildiz.Bas.entities.concretes.Auction;
import com.umutyildiz.Bas.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/auctions/")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping("createAuction")
    public void createAuction(@RequestBody Auction auction){
        auctionService.createAuction(auction);
    }

    @GetMapping("getByUser")
    List<Auction> getAuctionByUser(@RequestParam int userId){
        return auctionService.getAuctionByUser(userId);

    }

    @GetMapping("all")
    List<Auction> getAll(){
        return auctionService.getAll();
    }
}
