package PrototypeDesignPattern.ProductsExample;

public class Main {
    public static void main(String args[]) {
        ProductPrototype laptop = new Product("Dell Inspiron 14", 65000);

        // clone the laptop object
        ProductPrototype sameLaptopClone1 = laptop.clone();
        ProductPrototype sameLaptopClone2 = laptop.clone();
        ProductPrototype sameLaptopClone3 = laptop.clone();

        // display the details of the cloned objects
        laptop.display();
        System.out.println("Cloned Products:");
        sameLaptopClone1.display();
        sameLaptopClone2.display();
        sameLaptopClone3.display();

        // Create a mobile product
        ProductPrototype mobile = new Product("Samsung Galaxy S21", 79999);
        // Clone the mobile object
        ProductPrototype sameMobileClone1 = mobile.clone();
        ProductPrototype sameMobileClone2 = mobile.clone();
        ProductPrototype sameMobileClone3 = mobile.clone();

        // Display the details of the cloned objects
        System.out.println("\nCloned Mobile Products:");
        sameMobileClone1.display();
        sameMobileClone2.display();
        sameMobileClone3.display();
    }
}
