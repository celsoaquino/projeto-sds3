package com.celsoaquino.dsvendas.repositories;

import com.celsoaquino.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
