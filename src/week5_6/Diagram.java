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
public class Diagram {
    Layer layer = new Layer();

    public void deleteCircle(){
        for(int i= layer.s.size()-1;i>=0;--i){
            if(layer.s.get(i) instanceof Circle){
               layer.s.remove(i);
            }
            
            
        }
    }
    @Override
    public String toString() {
        return "Diagram{" + "layer=" + layer + '}';
    }

    public static void main(String[] args) {
        Diagram d = new Diagram();
        d.deleteCircle();
        System.out.println(d);
    }
}
