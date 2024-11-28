package org.example.deliveryservice.repository;

import org.example.deliveryservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query("SELECT c FROM Cart c WHERE c.authUser.id = :id")
    List<Cart> findAllByAuthUserId(@Param("id") Long id);
}
