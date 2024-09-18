package designpattern.structuralpattern.bridge;

// Concrete Implementor
public class PepperoniPizza implements PizzaType{
    @Override
    public void prepare() {
        System.out.println("preparing pepperoni pizza");
    }
}
