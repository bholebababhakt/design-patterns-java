package designpattern.structuralpattern.flyweight;

// Character Class - without flyweight
public class Character {

    private char symbol;
    private String font;
    private String style;
    private int size;

    public Character(char symbol, String font, String style, int size) {
        this.symbol = symbol;
        this.font = font;
        this.style = style;
        this.size = size;
        System.out.println("Creating new character object: " + symbol + " with font: " + font);
    }
    void display(int x , int y){
        System.out.println("Character: " + symbol + " [Font: " + font + ", Style: " + style + ", Size: " + size + "] at position (" + x + ", " + y + ")");
    }
}
