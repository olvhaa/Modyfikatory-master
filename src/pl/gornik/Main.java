package pl.gornik;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Łaciate", "Nabiał", 3.99, 3, "l");
        product1.setName("Alamaciate");
        product1.setCategory("Nabiał");
        product1.setPrice(4.99);
        product1.setWeightOrCapacity(2);
        product1.setUnitOfMeasure("kg");
        Product product2 = new Product("Alkowita", "Mleko", 4.99, 2, "l");
        Product product3 = new Product("Alamaciate", "Nabiał", 5.99, 1, "kg");
        Product product4 = new Product("Od krowy", "Mleko", 7.99, 1, "l");
        Product product5 = new Product("Alamazam", "Nabiał", 1.99, 3, "kg");
        Product product6 = new Product("Mlekovitam", "Nabiał", 2.99, 3, "l");

        ArrayList<Product> arrlist = new ArrayList<>();
        arrlist.add(product1);
        arrlist.add(product2);
        arrlist.add(product3);
        arrlist.add(product4);
        arrlist.add(product5);
        arrlist.add(product6);

        for (Product product : arrlist) {
            if (product.category.equalsIgnoreCase("Mleko")) {
                System.out.println(product);
            }
        }
        System.out.println("--------------------------------------");

        ArrayList<Product> productsAM = new ArrayList<>();
        for (Product product : arrlist) {
            if (product.getName().toLowerCase().charAt(0) > 96 && product.getName().toLowerCase().charAt(0) < 110) {
                productsAM.add(product);
            }
        }
        for (Product product : productsAM) {
            System.out.println(product);
        }


    }
}
//        TODO utwórz obiekt klasy Produkt
//        TODO przypisz do produktu wartości pól name, category, price, quantity
//        TODO utwórz 6 produktów i dodaj je do listy produktów
//        TODO wypisz tylko te produkty, które spełniają określony warunek, np: są z tej samej kategorii
//        TODO utwórz nową listę złozoną z produktów, których nazwa ropoczyna się od liter 'A' i kończy na 'M'