/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author THE TESSEN
 */
public class Circle extends Shape{
    final private double PI=3.14;
    private int radius;
    private Point Tam;
    public Circle(){    
        radius=50;
        Tam = new Point(50,50);
    }

    public Circle(int radius, Point Tam) {
        this.radius = radius;
        this.Tam = Tam;
    }
    @Override
    public void MoveTo(Point p){
        Tam.moveTo(p.getX(), p.getY());
    }
    public double Petermeter(){   
       return 2*PI*radius;
    } 
    public double Area(){   
       return PI*radius*radius;
    }
    @Override
    public Point Place(){
        return Tam;
    }

    @Override
    public String toString() {
        return "Day la hinh tron";
    }
    
}
