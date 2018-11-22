package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable> T Max(ArrayList<T> a){
        T max = a.get(0);
        for (int i = 1; i < a.size() ; i++){
            if(max.compareTo(a.get(i))<0)
                max = a.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Byte> byt = new ArrayList<Byte>();
        byt.add((byte)-5);
        byt.add((byte)10);
        byt.add((byte)4);
        byt.add((byte)-7);      
        System.out.println(Max(byt));
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(-5);
        num.add(10);
        num.add(4);
        num.add(-7);      
        System.out.println(Max(num));
        ArrayList<Character> cha = new ArrayList<Character>();
        cha.add('e');
        cha.add('a');
        cha.add('g');
        cha.add('z');      
        System.out.println(Max(cha));
        ArrayList<Short> sho = new ArrayList<Short>();
        sho.add((short)-5);
        sho.add((short)10);
        sho.add((short)4);
        sho.add((short)-7);      
        System.out.println(Max(sho));
        ArrayList<Long> lon = new ArrayList<Long>();
        lon.add(-5L);
        lon.add(10L);
        lon.add(4L);
        lon.add(-7L);      
        System.out.println(Max(lon));
        ArrayList<Float> flo = new ArrayList<Float>();
        flo.add(-5.1f);
        flo.add(10.2f);
        flo.add(4.3f);
        flo.add(-7.4f);      
        System.out.println(Max(flo));
        ArrayList<Double> dou = new ArrayList<Double>();
        dou.add(-5.1);
        dou.add(10.2);
        dou.add(4.3);
        dou.add(-7.4);      
        System.out.println(Max(dou));
    }
}
