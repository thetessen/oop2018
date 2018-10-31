package week7.task1;

public class Addition extends BinaryExpression{
    Expression left;
    Expression right;
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
    
    @Override
    public String toString() {
        return "("+left+" + " +right+") = "+ evaluate();
    }
    public static void main(String[] args) {
        Addition a = new Addition(new Numeral(8) , new Numeral(6));
        Square b= new Square(a);
        b.evaluate();
        System.out.println(b.toString());
    }
}
