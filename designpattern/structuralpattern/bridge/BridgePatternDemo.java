package designpattern.structuralpattern.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        CookingStyle americanVeggiePizza = new AmericanStyle(new VeggiePizza());
        CookingStyle italianPepperoniPizza = new ItalianStyle(new PepperoniPizza());
        americanVeggiePizza.deliver();
        italianPepperoniPizza.deliver();
    }
}
