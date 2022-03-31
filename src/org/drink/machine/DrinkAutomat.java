package org.drink.machine;

import my.Version;


public class DrinkAutomat {
    private final UserDisplay userDisplay;
    private final ProductStorage<Beverage> productStorage;

    public DrinkAutomat() {
        this.userDisplay = new UserDisplay();

        Beverage[] products = new Beverage[5];
        products[0] = new Beverage("Coca - Cola", 2.00,5, 0.33);
        products[1] = new Beverage("Fanta", 2.00,5,0.33);
        products[2] = new Beverage("Sprite", 2.00,5,0.25);
        products[3] = new Beverage("Fuse Tea", 1.50,5,0.25);
        products[4] = new Beverage("Bonaqua", 1.09,5,0.5);
        this.productStorage = new ProductStorage<>(products);
    }
    public void work() {
        while(true) {
            showProducts();
            Beverage selectedProduct =  selectProduct();
            payProduct(selectedProduct);
            if (!giveProduct(selectedProduct)) break;
        }
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }
    private Beverage selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        return productStorage.getProductByNumber(productNumber);
    }
    private boolean payProduct(Beverage selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPromt(productName,price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return payResult;
    }
    private boolean giveProduct(Beverage selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);
        return result;


    }
}
