package week7.task1;

public abstract class BinaryExpression extends Expression{
    public abstract Expression left();

    public abstract Expression right();

    @Override
    public int evaluate() {
        return 0;
    } 
    
    @Override
    public String toString() {
        return "";
    }

}
