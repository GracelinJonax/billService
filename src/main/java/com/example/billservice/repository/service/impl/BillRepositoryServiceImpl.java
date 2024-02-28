package com.example.billservice.repository.service.impl;

import com.example.billservice.repository.BillRepository;
import com.example.billservice.repository.service.BillRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class BillRepositoryServiceImpl implements BillRepositoryService {
    private final BillRepository billRepository;

    public BillRepositoryServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
}
