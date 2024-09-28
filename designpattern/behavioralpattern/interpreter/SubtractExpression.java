package designpattern.behavioralpattern.interpreter;

// Non-Terminal Expression for subtraction
public class SubtractExpression implements Expression {
    private Expression rightExpression;
    private Expression leftExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
