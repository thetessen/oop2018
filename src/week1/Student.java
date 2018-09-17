package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
		private String name;
		private String sid;
		private String group;
		private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getSid(){
			return sid;
		}
		public void setSid(String sid){
			this.sid = sid;
		}
		public String getGroup(){
			return group;
		}
		public void setGroup(String group){
			this.group = group;
		}
		public String getEmail(){
			return email;
		}
		public void setEmail(String email){
			this.email = email;
		}
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
		this.name = "Student";
		this.sid = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param email
     */
    Student(String name, String sid, String email) {
        // TODO:
		this.name = name;
		this.sid = sid;
		this.email = email;
		this.group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
		this.name = s.getName;
		this.sid = s.getSid;
		this.email = s.getEmail;
		this.group = s.getGroup;
    }

    void getInfo() {
        // TODO
		System.out.println( "Ho ten: "+	this.getName() + "\nMa sinh vien: "+this.getSid()
		+"\nLop: " +this.getGroup()+"\nEmail: "+this.getEmail()); 
        
    }

}
