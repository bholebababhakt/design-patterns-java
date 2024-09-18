package designpattern.structuralpattern.bridge;

// Refined Abstraction: Italian Cooking Style
public class ItalianStyle extends CookingStyle{
    public ItalianStyle(PizzaType pizzaType) {
        super(pizzaType);
    }

    @Override
    public void cook() {
        System.out.println("cooking in Italian style");
    }
}
