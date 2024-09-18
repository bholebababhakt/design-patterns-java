package designpattern.structuralpattern.bridge;

// here if we introduce one more cooking style or pizza type the number of classes grow exponentially
// method duplicated across class
// so we bridge design pattern
public class WithoutBridge {
    public static void main(String[] args) {

    }
}


// Veggie Pizza with American Cooking Style
class AmericanVeggiePizza {
    public void prepare() {
        System.out.println("Preparing American-style Veggie Pizza");
    }

    public void cook() {
        System.out.println("Cooking in American style (thick crust)");
    }

    public void deliver() {
        System.out.println("Delivering Veggie Pizza cooked in American style");
    }
}

// Veggie Pizza with Italian Cooking Style
class ItalianVeggiePizza {
    public void prepare() {
        System.out.println("Preparing Italian-style Veggie Pizza");
    }

    public void cook() {
        System.out.println("Cooking in Italian style (thin crust)");
    }

    public void deliver() {
        System.out.println("Delivering Veggie Pizza cooked in Italian style");
    }
}

// Pepperoni Pizza with American Cooking Style
class AmericanPepperoniPizza {
    public void prepare() {
        System.out.println("Preparing American-style Pepperoni Pizza");
    }

    public void cook() {
        System.out.println("Cooking in American style (thick crust)");
    }

    public void deliver() {
        System.out.println("Delivering Pepperoni Pizza cooked in American style");
    }
}

// Pepperoni Pizza with Italian Cooking Style
class ItalianPepperoniPizza {
    public void prepare() {
        System.out.println("Preparing Italian-style Pepperoni Pizza");
    }

    public void cook() {
        System.out.println("Cooking in Italian style (thin crust)");
    }

    public void deliver() {
        System.out.println("Delivering Pepperoni Pizza cooked in Italian style");
    }
}
