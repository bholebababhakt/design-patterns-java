package designpattern.structuralpattern.flyweight;

// Concrete Flyweight Class
public class ConcreteCharacter implements CharacterFlyweight {
    private char symbol; //intrensic state
    private String font;
    private String style;
    private int size;

    public ConcreteCharacter(char symbol, String font, String style, int size) {
        this.symbol = symbol;
        this.font = font;
        this.style = style;
        this.size = size;
    }

    @Override
    public void display(int x, int y) {
        // Display the character with its intrinsic and extrinsic state
        System.out.println("Character: " + symbol + " [Font: " + font + ", Style: " + style + ", Size: " + size + "] at position (" + x + ", " + y + ")");

    }
}
