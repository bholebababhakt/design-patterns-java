package designpattern.structuralpattern.flyweight;

public class TextEditorWithFlyweight {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Instead of creating new objects every time, we share the flyweights
        CharacterFlyweight a1 = factory.getCharacter('a', "Arial", "Bold", 12);
        CharacterFlyweight a2 = factory.getCharacter('a', "Arial", "Bold", 12); // Same flyweight as a1
        CharacterFlyweight b1 = factory.getCharacter('b', "Arial", "Bold", 12);

        a1.display(10, 20);//extrensic state
        a2.display(20, 30);
        b1.display(11, 20);
        // here we are reusing character a
    }
}
