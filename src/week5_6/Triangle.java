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
public class Triangle extends Shape{
    private Point point_A;
    private Point point_B;
    private Point point_C;
    
    public Triangle(){
        point_A = new Point(1, 1);
        point_B = new Point(2, 1);
        point_C = new Point(1, 2);
    }
            
    public Triangle(Point point_A, Point point_B, Point point_C) {
        this.point_A = point_A;
        this.point_B = point_B;
        this.point_C = point_C;
    }

    public Triangle(Point point_A, Point point_B, Point point_C, String color, Point center) {
        super(color, center);
        this.point_A = point_A;
        this.point_B = point_B;
        this.point_C = point_C;
    }

    @Override
    public Point Place(){
        Point c = new Point((point_A.getX()+point_B.getX()+point_C.getX())/3, (point_A.getY()+point_B.getY()+point_C.getY())/3);
        return c;
    }

    @Override
    public String toString() {
        return "Day la hinh tam giac";
    }
    
    
}
