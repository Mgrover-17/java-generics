package com.bridgelabz.onlineMarketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Creating products
        Product<BookCategory> book1 = new Product<>("Java Programming", 45.99, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Men's Shirt", 25.99, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 699.99, new GadgetCategory());

        // Adding to catalog
        catalog.addProduct(book1);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display products before discount
        catalog.displayCatalog();

        // Applying discounts
        ProductUtils.applyDiscount(book1, 10);
        ProductUtils.applyDiscount(shirt, 20);
        ProductUtils.applyDiscount(phone, 5);

        // Display products after discount
        catalog.displayCatalog();
    }
}
