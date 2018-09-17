package week1;
import java.util.ArrayList;
import java.util.HashSet;
public class StudentManagement {

    // TODO khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
	Student[] sv = new Student[100];
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
		if(s1.getGroup()== s2.getGroup()) return true;		
        else return false; 
    }

    void studentsByGroup() {
        // TODO:
		 HashSet<String>  h = new HashSet<String>();
		for(int i=0;i<sv.size();i++)	h.add(sv.get(i).getGroup());
    	String[] arr = new String[h.size()];
    	 h.toArray(arr);
    	for(int i=0; i < arr.length;i++) {
    		System.out.println("Lop "+arr[i]+" :");
    		for(Student s:sv) {
    			if(s.getGroup().equals(arr[i]))
    				System.out.println(s.getName());
    		}
    	}
    }

    void removeStudent(String id) {
        // TODO:
		 for(int i=0;i<sv.size();i++)
          {
              if( sv.get(i).getSid().equals(id)) sv.remove(i);
          }
    }

    public static void main(String[] args) {
        // TODO:
		Student nvThe = new Student("Nguyen Van The","17021038","thesondong@gmail.com");
    	nvThe.setGroup("INT22045");
    	System.out.println("Ten sinh vien: "+nvThe.getName());
    	nvThe.getInfo();
    	Student s1 = new Student("The","17021234","xxx.@gmail.com");
    	Student s2 = new Student();
    	Student s3 = new Student(s1);
    	s3.setGroup("INT22042");  	
    	main1 sinhvien = new main1();
    	sinhvien.sv.add(s1);
    	sinhvien.sv.add(s2);
    	sinhvien.sv.add(s3);    	
    	if(sinhvien.sameGroup( s1, s3)) {
   		 System.out.println("co cung lop");
    	} 
    	else System.out.println("khong cung lop");
    	sinhvien.studentsByGroup();
 //   	sinhvien.removeStudent("000");
    }
}
