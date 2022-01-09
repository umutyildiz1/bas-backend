package com.umutyildiz.Bas.dataAccess.abstracts;

import com.umutyildiz.Bas.entities.concretes.FavoriteUser;
import com.umutyildiz.Bas.entities.concretes.FavoriteUserId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteUserDao extends JpaRepository<FavoriteUser, FavoriteUserId> {
}
