package designpattern.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

// Composite: Represents a box that can contain products and other boxes
public class CompositeBox implements Box{

    private String boxName;

    private Double packagingCost;

    private List<Box> boxes = new ArrayList<>();

    public CompositeBox(String boxName, Double packagingCost) {
        this.boxName = boxName;
        this.packagingCost = packagingCost;
    }

    public void addBox(Box box){
        boxes.add(box);
    }

    public void removeBox(Box box){
        boxes.remove(box);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = packagingCost;
        for (Box box: boxes){
            totalPrice += box.calculateTotalPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Box: " + boxName + " (Packaging: $" + packagingCost + ")";
    }
}
