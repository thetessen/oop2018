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
public class Rectangle extends Shape{
    private Point point_A;
    private Point point_D;
    public Rectangle(){
        point_A = new Point();
        point_D = new Point(4,4);
    }

    public Point getPoint_A() {
        return point_A;
    }

    public Point getPoint_D() {
        return point_D;
    }

    public void setPoint_A(Point point_A) {
        this.point_A = point_A;
    }

    public void setPoint_D(Point point_D) {
        this.point_D = point_D;
    }
         
    public int Petermeter(){   
       return 2*Math.abs((point_A.getX()-point_D.getX())+(point_D.getY()-point_A.getY()));
    }
    public void moveTo(Point p){
        point_A.moveTo(point_A.getX()+(p.getX()-this.Place().getX()),point_A.getY()+(p.getY()-this.Place().getY()) );
        point_D.moveTo(point_D.getX()+(p.getX()-this.Place().getX()),point_D.getY()+(p.getY()-this.Place().getY()) );
    }
    public int Area(){
         return Math.abs((point_A.getX()-point_D.getX())*(point_D.getY()-point_A.getY()));
    }
    public Point Place(){
        Point c = new Point((point_A.getX()+point_D.getX())/2,(point_A.getY()+point_D.getY())/2 );
        return c;
    }

    @Override
    public String toString() {
        return "Day la hinh chu nhat";
    }
    
}
