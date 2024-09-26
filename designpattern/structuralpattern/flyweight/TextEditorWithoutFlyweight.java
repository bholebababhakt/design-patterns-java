package designpattern.structuralpattern.flyweight;

public class TextEditorWithoutFlyweight {
    public static void main(String[] args) {
        // Create many character objects, each with its own data
        Character a1 = new Character('a',"Arial","font",12);
        Character a2 = new Character('a', "Arial", "Bold", 12); // Duplicate intrinsic state!
        Character b1 = new Character('b', "Arial", "Bold", 12);
        a1.display(10, 20);
        a2.display(30, 40);
        b1.display(50, 60);
        // here we don't have to create a1 and a2 just because we want to display at two position;
    }
}
