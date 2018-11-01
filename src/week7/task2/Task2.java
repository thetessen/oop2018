package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void nullpointer() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }
    
    public void arrayindexofbound() throws ArrayIndexOutOfBoundsException {
       int[] array = {};
        System.out.println(array[-1]);
    }
    
    public void arithmetic() throws ArithmeticException {
        int a=1;
        int b=a/0;
    }
    
    public void classcast() throws ClassCastException {       
        Object t = new Integer (13);
        System.out.println ((float) t);
    }
    public void io() throws IOException {
        File f = new File("J:\\txt");
           if (!f.isFile()) {
                f.createNewFile(); 
           } 
           else {
                f.exists();
            }
    }

    public void filenotfound() throws FileNotFoundException {
        File f=new File("data1.txt");
        Scanner sc = new Scanner(f) ;         
        sc.close();
    }
    
    public static void main(String[] args)  {
        Task2 test = new Task2();     
            try {
            test.nullpointer();
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
            test.arrayindexofbound();
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
            test.arithmetic();
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
            test.classcast(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
             test.io(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
            try {
            test.filenotfound();
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }
}
