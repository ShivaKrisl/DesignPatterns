package PrototypeDesignPattern.ProductsExample;

public class Product extends ProductPrototype {

    public String productName;

    public double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // creates a new instance of Product with the same values as the current
    // instance
    @Override
    public ProductPrototype clone() {
        return new Product(productName, productPrice);
    }

    @Override
    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

}
