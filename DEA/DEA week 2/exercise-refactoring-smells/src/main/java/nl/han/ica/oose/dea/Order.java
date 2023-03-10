package nl.han.ica.oose.dea;

import java.util.ArrayList;
import java.util.List;

// TODO: Fix 'data class' or 'lazy class' smell. No or very little behaviour?
public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }
}
