package designpattern.structuralpattern.composite;

// Leaf: Represents an individual product in the Amazon box
public class Product implements Box{

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTotalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
