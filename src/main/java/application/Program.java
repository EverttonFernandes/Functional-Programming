package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Smart-Tv", 5000.00));
        productList.add(new Product("IPhone 12", 7000.00));
        productList.add(new Product("Playstation 5", 5500.00));

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        productList.sort(comparator);

        for (Product product : productList) {
            System.out.println(product);
        }

    }
}
