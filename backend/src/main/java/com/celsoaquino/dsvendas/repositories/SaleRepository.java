package com.celsoaquino.dsvendas.repositories;

import com.celsoaquino.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}