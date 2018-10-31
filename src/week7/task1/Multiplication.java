/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author THE TESSEN
 */
public class Multiplication extends BinaryExpression{
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

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
    
    @Override
    public String toString() {
        return "("+left+" * " +right+") = "+ evaluate();
    }
}
