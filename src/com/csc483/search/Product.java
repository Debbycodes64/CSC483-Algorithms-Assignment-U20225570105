package com.csc483.search;

public class Product {
    private int productId;        // [cite: 60]
    private String productName;   // [cite: 63]
    private String category;      // [cite: 64]
    private double price;         // [cite: 66]
    private int stockQuantity;    // [cite: 68]

    // Constructor to create a product [cite: 52]
    public Product(int productId, String productName, String category, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters so our search algorithms can read the data
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
}