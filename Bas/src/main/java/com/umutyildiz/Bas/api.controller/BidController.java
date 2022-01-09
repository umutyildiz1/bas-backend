package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.BidService;
import com.umutyildiz.Bas.entities.concretes.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/bids/")
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping("createBid")
    public void createBid(@RequestBody Bid bid){
        bidService.createBid(bid);
    }
}
