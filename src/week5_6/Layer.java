/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;

/**
 *
 * @author THE TESSEN
 */
public class Layer {
    public  ArrayList<Shape> s = new ArrayList<Shape>();
    
    public Layer(){
        Circle s1 = new Circle(3, new Point(3, 4));
        Circle s2 = new Circle(4,new Point(6, 3));
        Square s3 = new Square();
        Circle s4 = new Circle();
        Triangle s5 = new Triangle();
        Rectangle s6 = new Rectangle();
        Square s7 = new Square(5, new Point(2, 4));        
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        s.add(s6);
        s.add(s7);

    }
    public void deleteTriangle(){
        for(int i=0;i<s.size();i++){
            if(s.get(i) instanceof Triangle)
                s.remove(s.get(i));
           
        }

    }

    @Override
    public String toString() {
        return "Layer{" + "s=" + s + '}';
    }
  
//    public static void main(String[] args) {
//        Layer l =new Layer();
//        l.deleteTriangle();
//        System.out.println(l);
//        
//    }
}
