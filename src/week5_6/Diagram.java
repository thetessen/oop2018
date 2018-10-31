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
public class Diagram {
    ArrayList<Layer> l = new ArrayList<Layer>();

    public Diagram() {
        Layer l1= new Layer();
        Layer l2= new Layer();
        Layer l3= new Layer();
        l.add(l1);
        l.add(l2);
        l.add(l3);
    }
    
    
    public void deleteCircle(){
         for(Layer la: l){
             for(int i = la.s.size()-1;i>=0;--i)
                 if(la.s.get(i) instanceof Circle)
                     la.s.remove(i);
            
        }
    }

    @Override
    public String toString() {
        return "Diagram{" + "l=" + l + '}';
    }
    
    

    public static void main(String[] args) {
        Diagram d = new Diagram();
        d.deleteCircle();
        System.out.println(d);
    }
}
