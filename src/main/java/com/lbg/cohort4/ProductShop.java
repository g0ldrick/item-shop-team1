package com.lbg.cohort4;

import java.util.ArrayList;
import java.util.Random;

public class ProductShop {
    ArrayList<Product> products;
    ArrayList<Product> basket;
    private boolean populated;
    public ProductShop(){
        this.products = new ArrayList<>();
        populated = false;
    }

    public void showProducts(){
        System.out.println("Available Products:");

        for (Product p:
             products) {
            System.out.println(p.getProductCode() + " Price (£): " + p.getPrice()
            + "\nVAT (%): " + p.getVat() + "\nTotal (£): " + individualProductTotal(p)
            + "\n");
        }
    }

    public void populateShop(int numItems){
        Random r = new Random();
        for (int i = 0; i < numItems; i++){
            products.add(new Product("PROD" + i, r.nextInt(50)));
        }
        populated = true;
        for (Product product:
             products) {
            if (r.nextInt(4) == 3){
                product.setVat(0);
            }
        }
    }
    public ProductShop(ArrayList<Product> products){
        this.products = products;
    }

    public double basketTotal(){
        if(!populated)
            return 0;

        double total = 0;
        for (Product p :
             basket) {
            total += p.getPrice() + (p.getPrice() * p.getVat()/100);
        }
        return total;
    }
    public void addToBasket(Product p, int quantity){
        for (int i = 0; i < quantity; i++){
            basket.add(p);
        };
    }
    private double individualProductTotal(Product p){
        return p.getPrice() + (p.getPrice() * p.getVat()/100);
    }

}
