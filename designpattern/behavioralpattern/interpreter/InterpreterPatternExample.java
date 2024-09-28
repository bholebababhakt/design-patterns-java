package designpattern.behavioralpattern.interpreter;

public class InterpreterPatternExample {
    public static void main(String[] args) {
        Expression three = new NumberExpression(3);
        Expression nine = new NumberExpression(9);
        Expression two = new NumberExpression(2);

        AddExpression addExpression = new AddExpression(three,nine);
        SubtractExpression subtractExpression = new SubtractExpression(addExpression,two);

        int result = subtractExpression.interpret();
        System.out.println("(3 + 9) - 2 = " + result);
    }
}
