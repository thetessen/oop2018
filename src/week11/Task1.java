package week11;

public class Task1 {
    public static <T extends Comparable> void Sort(T[] a){
        for(int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if(a[j].compareTo(a[j+1])>0){
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Byte[] byt = {6,1,5,4,7};
        Character[] cha = {'a','s','d','f'};
        Integer[] num = {-4,2,5,-6,7};
        Float[] flo = { 6.2f,-6f,3.6f,1.5f};
        Double[] dou = {1.3,5.1,-1.5,-5.8};
        Short[] sho =  {1,4,6,-4};
        Long[] lon =  {1L,10L,-2L,4L};
        Sort(byt);
        Sort(cha);
        Sort(num);
        Sort(flo);
        Sort(dou);
        Sort(sho);
        Sort(lon);
        for(Byte b:byt)
        System.out.print(b+" ");
        System.out.println();
        for(Character c:cha)
        System.out.print(c+" ");
        System.out.println();    
        for(Integer i:num)
        System.out.print(i+" ");
        System.out.println();       
        for(Float f:flo)
        System.out.print(f+" ");
        System.out.println();       
        for(Double d:dou)
        System.out.print(d+" ");
        System.out.println();       
        for(Short s:sho)
        System.out.print(s+" ");
        System.out.println();       
        for(Long l:lon)
        System.out.print(l+" ");
        
    }
}
