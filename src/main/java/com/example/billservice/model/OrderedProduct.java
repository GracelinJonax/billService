package com.example.billservice.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class OrderedProduct {
    @Id
    @UuidGenerator
    private String productId;
    private int quantity;
    private Double price;
    private Double gst;
}
