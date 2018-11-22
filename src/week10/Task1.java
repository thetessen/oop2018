package week10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week9.Utils;

public class Task1 {
    List<String> getAllFunctions(File path){
        List<String> list = new ArrayList<>();
        String s="",s1="",s2="";        
        try {
           Scanner sc = new Scanner(path);
           while (sc.hasNext()) {
                
                if(s1.contains("public static"))
                {
                    s+=s1+"\n"; 
                    while(1>0){
                        s2=sc.nextLine();
                        if(s2.contains("public static")||!sc.hasNext()){
                            s1=s2;
                            break;
                        }
                        else s+=s2+"\n";                        
                    }
                   list.add(s); 
                   s="";             
                }  
                else  s1=sc.nextLine(); 
           }
           sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
        
    }
    
    public String findFunctionByName(String name){
        String[] s = name.split("\\(");     //tên hàm
        String[] st = s[1].split("\\)");
        String[] str = st[0].split(",");    //kiểu biến
       
        List<String> list = new ArrayList<>();
        try {
           Scanner sc = new Scanner(new File("src\\week9\\Utils.java"));
           while (sc.hasNext()) {
               String s1=sc.nextLine(); 
               if(s1.contains(s[0]))
                   list.add(s1);                
           }
           sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for(String l:list){
            String[] b=l.split("\\s");
            String[] c = b[7].split("\\(");
            if(c[0].equals(s[0])){
                boolean check=true;
                String[] str2 = null;
                List<String> str3 = new ArrayList<>();
                String[] a = l.split("\\(");     //tên hàm
                String[] st1 = a[1].split("\\)");
                String[] str1 = st1[0].split(",");    //kiểu biến
                for(String f:str1){
                    str2 = f.split("\\s");
                    str3.add(str2[0]);
                }
                if(str.length==str3.size()){
                    for(int i=0;i<str.length;i++){
                        if(!str[i].equals(str3.get(i))){
                            check=false;
                            break;
                        }
                    }
                }
                else check=false;
                String temp=l;
                if(check==true&&!l.trim().startsWith("\\\\")) return l;
            }
                
        }
        return null;
    }
    public static void main(String[] args) {
        Task1 task = new Task1();
        File file = new File("src\\week9\\Utils.java");
        List<String> list = new ArrayList<>();
        list = task.getAllFunctions(file);
        System.out.println(list);
       System.out.println(task.findFunctionByName("findFileByName(String,String)"));
    }
}
