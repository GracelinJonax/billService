package com.example.billservice.repository.service.impl;

import com.example.billservice.repository.OrderedProductRepository;
import com.example.billservice.repository.service.OrderedProductRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class OrderedProductRepositoryServiceImpl implements OrderedProductRepositoryService {
    private final OrderedProductRepository orderedProductRepository;

    public OrderedProductRepositoryServiceImpl(OrderedProductRepository orderedProductRepository) {
        this.orderedProductRepository = orderedProductRepository;
    }
}
