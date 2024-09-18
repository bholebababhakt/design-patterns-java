package designpattern.structuralpattern.bridge;

// Concrete Implementor
public class VeggiePizza implements PizzaType{
    @Override
    public void prepare() {
        System.out.println("preparing veggie pizza");
    }
}
