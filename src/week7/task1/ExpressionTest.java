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
public class ExpressionTest {
    public static void main(String[] args) {

        Expression e1 = new Square(new Numeral(10));
        Expression e2 = new Subtraction(e1,new Numeral(1));
        Expression e3 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression e4 = new Addition(e2, e3);
        Expression e5 = new Square(e4);     
        Expression e6 = new Division(e5,new Numeral(0));

        System.out.println(e5.evaluate());
        try {
            System.out.println(e6.evaluate());
        }catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }        
    }
    
}
