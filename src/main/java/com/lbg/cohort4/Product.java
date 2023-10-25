package com.lbg.cohort4;

public class Product {
    private final String productCode;
    private final double price;
    private double vat;
    private boolean warranty;
    public Product(String productCode, double price, double vat){
        this.productCode = productCode;
        this.price = price;
        this.vat = vat;
        this.warranty = false;
    }
    public Product(String productCode, double price){
        this.productCode = productCode;
        this.price = price;
        this.vat = 20;
        this.warranty = false;
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

    public void setVat(double vat) {
        this.vat = vat;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}
