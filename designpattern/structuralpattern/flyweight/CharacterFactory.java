package designpattern.structuralpattern.flyweight;

import java.util.HashMap;

public class CharacterFactory {
    private HashMap<String,CharacterFlyweight> flyweights = new HashMap<>();

    public CharacterFlyweight getCharacter(char symbol,String font,String style,int size){
        String key = symbol+font+style+size;
        if(flyweights.containsKey(key)){
            return flyweights.get(key);
        }
        CharacterFlyweight character = new ConcreteCharacter(symbol,font,style,size);
        flyweights.put(key,character);
        System.out.println("Creating new character object: " + symbol + " with font: " + font);
        return character;
    }
}
