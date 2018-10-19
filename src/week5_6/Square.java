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
public class Square extends Rectangle{
    private int side;
    private Point Tam;
    public Square(){
        super();
        side =2;        
        Tam = new Point(2,2);    
    }

    public Square(int side, Point Tam) {
        this.side = side;
        this.Tam = Tam;
    }
  
    @Override
    public void MoveTo(Point p){
        Tam.moveTo(p.getX(), p.getY());
    }

    @Override
    public int Petermeter(){
        return side*4;
    }
    
    @Override
    public int Area(){
        return side*side;
    }
    @Override
    public Point Place(){
        return Tam;
        
    }

    @Override
    public String toString() {
        return "Day la hinh vuong";
    }
    
}
