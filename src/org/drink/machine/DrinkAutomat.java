package org.drink.machine;

import java.util.Scanner;

public class DrinkAutomat {
    private final UserDisplay userDisplay;
    private final ProductStorage productStorage;

    public DrinkAutomat() {
        this.userDisplay = new UserDisplay();
        this.productStorage = new ProductStorage();
    }
    public void work() {
        showProducts();
        Product selectedProduct = selectProduct();
        payProduct(selectedProduct);
        giveProduct(selectedProduct);
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }
    private Product selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        return productStorage.getProductByNumber(productNumber);
    }
    private boolean payProduct(Product selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPromt(productName,price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return payResult;
    }
    private void giveProduct(Product selectedProduct) {

    }
}
