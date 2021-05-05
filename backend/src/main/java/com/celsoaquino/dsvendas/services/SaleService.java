package com.celsoaquino.dsvendas.services;

import com.celsoaquino.dsvendas.dto.SaleDTO;
import com.celsoaquino.dsvendas.dto.SaleSuccessDTO;
import com.celsoaquino.dsvendas.dto.SaleSumDTO;
import com.celsoaquino.dsvendas.entities.Sale;
import com.celsoaquino.dsvendas.repositories.SaleRepository;
import com.celsoaquino.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result =  saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }
}
