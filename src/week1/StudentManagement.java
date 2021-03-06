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
    	for(String ha:h) {
    		System.out.println("Lop "+ ha +" :");
    		for(int j=0 ; j<count ; j++){
    			if(sv[j].getGroup().equals(ha))
    				System.out.println(sv[j].getName());
    		}
    	}
   }

    void removeStudent(String id) {
        // TODO   
    	int count=0, index=-1;
        while(sv[++count] != null);	
        for(int i=0 ; i<count ; i++) {
        	if(sv[i].getSid().equals(id)) {
        		index=i;
        		break;
        	}
        }
        if(index!=-1) {
        	for(int i=index ; i<count-1 ; i++) {
        		sv[i]=sv[i+1];
        	}
            sv[count-1]=null;
        }
          
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
//    	for(int i=0;sinhvien.sv[i]!=null;i++) {
//    		System.out.println(sinhvien.sv[i].getName());
//    	}
    }
}
