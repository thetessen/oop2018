package week1;
import java.util.HashSet;
public class StudentManagement {

	public   Student[] sv = new Student[100]; 
    public  boolean sameGroup(Student s1, Student s2) {
    	if(s1.getGroup().equals(s2.getGroup())) return true;	
        else return false; 
    }

     void  studentsByGroup() {   	
        HashSet<String>  h = new HashSet<String>();
        int count=0;
        while(sv[++count] != null);	
		for(int i=0 ; i<count ; i++)	h.add(sv[i].getGroup());
    	String[] arr = new String[h.size()];
    	h.toArray(arr);
    	for(int i=0 ; i < arr.length ; i++) {
    		System.out.println("Lop "+arr[i]+" :");
    		for(int j=0;j<count;j++){
    			if(sv[j].getGroup().equals(arr[i]))
    				System.out.println(sv[j].getName());
    		}
    	}
   }

    void removeStudent(String id) {
        // TODO   
    	  
   }

    public static void main(String[] args) {
    	Student nvThe = new Student("Nguyen Van The","17021038","thesondong@gmail.com");
    	nvThe.setGroup("INT22045");
    	System.out.println("Ten sinh vien: " + nvThe.getName());
    	nvThe.getInfo();
    	Student s1 = new Student("The","17021234","xxx.@gmail.com");
    	Student s2 = new Student();
    	Student s3 = new Student(s1);
    	s3.setGroup("INT22042");  	
    	StudentManagement sinhvien = new StudentManagement();
    	sinhvien.sv[0]=new Student(s1);
    	sinhvien.sv[1]=new Student(s2);
    	sinhvien.sv[2]=new Student(s3);
    	if(sinhvien.sameGroup(sinhvien.sv[0] ,sinhvien.sv[1])) {
   		 System.out.println("co cung lop");
    	} 
    	else System.out.println("khong cung lop");
    	sinhvien.studentsByGroup();
 //   	sinhvien.removeStudent("000");
    }
}
