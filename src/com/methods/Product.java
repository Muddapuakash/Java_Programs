package com.methods;


//Problem: Create Product class with name, code, price, quantity. 
//Add methods for total value, restock, and sell operations.

public class Product {
	String productName;
    String productCode;
    double price;
    int quantity;
    
    public double calculateTotalValue() {
        return price * quantity;
    }
    
    public void restock(int addQuantity) {
        if (addQuantity > 0) {
            quantity += addQuantity;
            System.out.println("Restocked: " + addQuantity + " units");
            System.out.println("New Quantity: " + quantity);
        } else {
            System.out.println("Invalid restock quantity!");
        }
    }
    
    public void sell(int sellQuantity) {
        if (sellQuantity <= 0) {
            System.out.println("Invalid sell quantity!");
        } else {
            if (sellQuantity > quantity) {
                System.out.println("Insufficient stock!");
            } else {
                quantity -= sellQuantity;
                double revenue = sellQuantity * price;
                System.out.println("Sold: " + sellQuantity + " units");
                System.out.printf("Revenue: Rs. %.2f%n", revenue);
                System.out.println("Remaining: " + quantity + " units");
            }
        }
    }
    
    public void displayInfo() {
        System.out.println("===== PRODUCT INFO =====");
        System.out.println("Name: " + productName);
        System.out.println("Code: " + productCode);
        System.out.printf("Price: Rs. %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Value: Rs. %.2f%n", calculateTotalValue());
        System.out.println("========================");
    }
    
    public static void main(String[] args) {
        Product product = new Product();
        product.productName = "Laptop";
        product.productCode = "LT001";
        product.price = 45000.00;
        product.quantity = 10;
        
        product.displayInfo();
        product.sell(3);
        System.out.println();
        product.restock(5);
    }

}
