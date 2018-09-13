package week1;

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
    }

    void removeStudent(String id) {
        // TOD
    }

    public static void main(String[] args) {
        // TODO:
    }
}
