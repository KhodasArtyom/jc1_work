package org.drink.machine;

import java.util.Scanner;

public class UserDisplay {


    public void print(Product[] products) {
        for (int productNumber = 1; productNumber <= products.length; productNumber++) {
            int i = productNumber - 1;
            if (products[i] == null || products[i].getCount() <= 0) continue;
            System.out.println("[" + productNumber + "]" + products[i].getName() + " "
                    + products[i].getPrice());
        }
    }

    public void promptSelectProduct() {
        System.out.println("Please select product: ");
    }

    public int readProductNumber() {
        Scanner scanner = new Scanner(System.in);
        //TODO: create method to genarate regexp dynamically
        String productNumberPattern = "[1-5]";
        boolean isCorrectValue = false;
        int productNumber = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(productNumberPattern)) {
                isCorrectValue =true;
                productNumber = scanner.nextInt();
            } else {
                isCorrectValue = true;
            }
            scanner.nextLine();
        }

        return productNumber;
    }

    public void printPaymentPromt(String productName, double price) {
        System.out.println("Product: " + productName + "price: " + price);
        System.out.println("Please pay with your bank card");

    }

    public void printPaymentResult(boolean payResult) {
        if(payResult) {
            System.out.println("Payment complete");
        } else {
            System.out.println("Payment error");
        }
    }
}