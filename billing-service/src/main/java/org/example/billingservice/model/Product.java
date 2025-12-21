package org.example.billingservice.model;

import lombok.*;

@Getter @Setter
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
