package designpattern.structuralpattern.bridge;

// Refined Abstraction: American Cooking Style
public class AmericanStyle extends CookingStyle{

    public AmericanStyle(PizzaType pizzaType) {
        super(pizzaType);
    }

    @Override
    public void cook() {
        System.out.println("cooking in american style");
    }
}
