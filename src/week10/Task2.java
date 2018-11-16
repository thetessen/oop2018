package week10;

import java.util.Random;

public class Task2 {
    public float[] arr = new float[1000];
    public void Khoitao(){
        Random rd = new Random();
        for(int i=0; i < arr.length; i++){         
                arr[i] = rd.nextFloat()*100;                        
        }     
    }
    
    public void Xuat(){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
    public void BubbleSort(float[] a){
        for(int i=0 ; i < a.length-1; i++){
            for (int j=0 ; j < a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
        }
    }
   
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.Khoitao();
        task.BubbleSort(task.arr);
        task.Xuat();

    }
}
