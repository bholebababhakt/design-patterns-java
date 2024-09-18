package designpattern.structuralpattern.bridge;

// Abstraction: CookingStyle class refers to the pizza type
abstract class CookingStyle {
    private PizzaType pizzaType;

    public CookingStyle(PizzaType pizzaType){
        this.pizzaType=pizzaType;
    }

    public abstract void cook();

    public void deliver(){
        pizzaType.prepare();
        cook();
        System.out.println("Your desired pizza is ready \nDelevering the  pizza");
    }
}
