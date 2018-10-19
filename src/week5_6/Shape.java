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
public class Shape {
    private String color;
    Point center;
    
    public Shape(){
        center = new Point();
        color="red";
    }

    public Shape(String color, Point center) {
        this.color = color;
        this.center = center;
    }


    public String getColor() {
        return color;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void MoveTo(Point p){
        this.center=p;
    }
    public Point Place(){
        return center;
    }
    
}
