package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // TODO: implement



        return products.stream().map(product -> product.getPrice()).reduce((p1, p2) -> p1 + p2).get();
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        return products.stream().filter(product -> product.getCategory().GADGETS.equals(product.getCategory())).map(product -> product.getPrice()).reduce((p1, p2) -> p1 + p2).get();
    }
}
