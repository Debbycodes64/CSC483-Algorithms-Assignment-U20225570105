package com.csc483.assignment1;

public class Product {
    int productId;
    String productName;
    String category;
    double price;
    int stockQuantity;

    // Constructor
    public Product(int productId, String productName, String category, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
