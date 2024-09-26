package designpattern.structuralpattern.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
    Box b1 = new Product("phone",12000.00);
    Box b2 = new Product("charger",300.00);
    CompositeBox smallbox = new CompositeBox("mobile items",50.00);
    smallbox.addBox(b1);
    smallbox.addBox(b2);

    Box b3 = new Product("laptop",120000.00);
    Box b4 = new Product("LaptopCharger",3000.00);

    CompositeBox mediumBox = new CompositeBox("Laptop accessories",200.00);
    mediumBox.addBox(b3);
    mediumBox.addBox(b4);

    Box b5 = new Product("data cable",500.00);
    CompositeBox smallbox2 = new CompositeBox("cable items",50.00);
    smallbox2.addBox(b5);
    mediumBox.addBox(smallbox2);
    Box b6 = new Product("monitor",8000.00);
    CompositeBox largebox = new CompositeBox("monitor",500.00);
    largebox.addBox(b6);

    CompositeBox courrierBox = new CompositeBox("courier box",1500.00);
    courrierBox.addBox(largebox);
    courrierBox.addBox(mediumBox);
    courrierBox.addBox(smallbox);

    courrierBox.calculateTotalPrice();
    System.out.println("Total price in " + courrierBox + ": $" + courrierBox.calculateTotalPrice());

    }
}
