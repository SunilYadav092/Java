class Product {
    String productName;
    double price;

    void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }

    void displayFinalPrice() {
        System.out.println("Product: " + productName);
        System.out.println("Final Price: $" + price);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.productName = "Laptop";
        product.price = 1000.00;

        product.applyDiscount(10); // Applying 10% discount
        product.displayFinalPrice();
    }
}
