package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidDao extends JpaRepository<Bid,Integer> {
}
