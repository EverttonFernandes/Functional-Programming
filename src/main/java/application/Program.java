package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Smart-Tv", 5000.00));
        productList.add(new Product("IPhone 12", 7000.00));
        productList.add(new Product("Playstation 5", 5500.00));

        productList.removeIf(Product::staticProductPredicate); // Method References

        for (Product product : productList) {
            System.out.println(product);
        }

    }
}
