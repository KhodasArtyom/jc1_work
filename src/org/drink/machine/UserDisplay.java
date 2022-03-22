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
                productNumber = scanner.nextInt();
            } else {
                isCorrectValue = true;
            }
        }

        return productNumber;
    }
}