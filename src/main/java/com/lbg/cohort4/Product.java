package com.lbg.cohort4;

public class Product {
    private final String productCode;
    private final double price;
    private double vat;
    public Product(String productCode, double price, double vat){
        this.productCode = productCode;
        this.price = price;
        this.vat = vat;
    }
    public Product(String productCode, double price){
        this.productCode = productCode;
        this.price = price;
        this.vat = 20;
    }
    public String getProductCode() {
        return productCode;
    }
    public double getPrice() {
        return price;
    }
    public double getVat() {
        return vat;
    }
}
