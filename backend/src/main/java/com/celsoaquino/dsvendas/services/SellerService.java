package com.celsoaquino.dsvendas.services;

import com.celsoaquino.dsvendas.dto.SellerDTO;
import com.celsoaquino.dsvendas.entities.Seller;
import com.celsoaquino.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        List<Seller> result =  sellerRepository.findAll();
        return result.stream()
                .map(s -> new SellerDTO(s))
                .collect(Collectors.toList());
    }
}
