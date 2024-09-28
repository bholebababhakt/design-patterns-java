package designpattern.behavioralpattern.interpreter;

// Terminal Expression for numbers
//These are the leaf nodes in our interpreter tree
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
