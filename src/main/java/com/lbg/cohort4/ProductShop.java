package com.lbg.cohort4;

import java.util.ArrayList;

public class ProductShop {
    ArrayList<Product> products;

    public ProductShop(){
        this.products = new ArrayList<>();
    }
    public ProductShop(ArrayList<Product> products){
        this.products = products;
    }

    public double basketTotal(){
        double total = 0;
        for (Product p :
             products) {
            total += p.getPrice() + (p.getPrice() * p.getVat());
        }
        return total;
    }

}
