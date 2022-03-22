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
        System.out.println("Product number " + productNumber );
        return null;
    }
    private void payProduct(Product selectedProduct) {
    }
    private void giveProduct(Product selectedProduct) {
    }
}
