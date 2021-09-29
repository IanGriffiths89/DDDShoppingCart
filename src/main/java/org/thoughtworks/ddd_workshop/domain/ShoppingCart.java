package org.thoughtworks.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private final Map<Product, Integer> products;
    private List<Item> items;

    public ShoppingCart() {
        this.products = new HashMap<>();
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.put(product, 1);
    }

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
