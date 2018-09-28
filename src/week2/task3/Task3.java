package week2.task3;
import java.util.ArrayList;
public class Task3 {
	public class Student{
		private String name;
		private String sid;
		private String email;
		private double GPA;
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
		
		public String getEmail(){
			return email;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public double getGPA() {
			return GPA;
		}
		public void setGPA(double GPA) {
			this.GPA = GPA;
		}
		public Student(String name, String sid, String email, double d) {
			this.setName (name);
			this.setSid ( sid);
			this.setEmail ( email);
			this.setGPA ( d);
		}
//		in ra các sinh viên tốt nghiệp lạo giỏi	
		public void totNghiep(ArrayList<Student> sv) {
			System.out.println("Danh sách sinh viên tốt nghiệp loại giỏi:");
			System.out.println("Họ tên\t\tMã sinh viên\tGPA");
			for(Student s:sv) {
				if(s.getGPA() >= 3.2 && s.getGPA() < 3.7 ) {
					System.out.println(s.getName()+"\t"+s.getSid()+"\t"+s.getGPA());
				}
			}
			System.out.println("------------------------------------------------");
		}
//		sắp xếp danh sách sinh viên theo GPA giảm dần
		public void sapXepGPA(ArrayList<Student> sv) {
			for(int i=0;i<sv.size();i++) {
				for(int j=i+1;j<sv.size();j++) {
					if(sv.get(i).getGPA()<sv.get(j).getGPA()) {
						Student temp = sv.get(i);
						sv.set(i,sv.get(j));
						sv.set(j, temp);
								
					}
				}
			}
			System.out.println("Danh sách sinh viên sắp xếp theo GPA giảm dần:");
			System.out.println("Họ tên\t\tMã sinh viên\tGPA");
			for(Student s: sv) {
				System.out.println(s.getName()+"\t"+s.getSid()+"\t"+s.getGPA());
			}
			System.out.println("------------------------------------------------");
		}
//		Tìm sinh viên
		public void Search(ArrayList<Student> sv,String ten) {
			boolean check = false;	
			int count=0;
			 System.out.println("Kết quả tìm kiếm "+"\""+ten+"\":");
			for(Student s: sv) {
				check = s.getName().contains(ten);
				if(check)	{
					System.out.println(s.getName());
					count++;
				}
			}
			if(count == 0)  System.out.println("Không tìm thấy "+"\""+ten+"\":");
			System.out.println("------------------------------------------------");
		}		
		
	}
	
	public class PhongTro{	
		private int phong;
		private int sodien;
		private int sonuoc;
		private final int gianuoc = 30000;
		private final int giadien = 4000;
		private final int giaphong = 2000000;
		private int phat = 500000;
		public int getPhong() {
			return phong;
		}
		public void setPhong(int phong) {
			this.phong = phong;
		}
		public int getSodien() {
			return sodien;
		}
		public void setSoien(int soien) {
			this.sodien = soien;
		}
		public int getSonuoc() {
			return sonuoc;
		}
		public void setSonuoc(int sonuoc) {
			this.sonuoc = sonuoc;
		}
		public PhongTro(int phong, int sodien, int sonuoc) {
			this.phong = phong;
			this.sodien = sodien;
			this.sonuoc = sonuoc;
		}
		//các phòng dùng quá 300 số điệ 1 tháng sẽ bị phát 500k;
		public void Phat(ArrayList<PhongTro> pt) {
			System.out.println("Các phòng bị phạt vì sử dụng điện không tiết kiệm ");
			for(PhongTro p:pt) {
				if(p.getSodien()>300) {
					System.out.println("Phòng "+p.getPhong()+" : "+p.getSodien()+" số điện");
				}
			}
			System.out.println("------------------------------------------------");
		}
		//tiền trọ tháng này
		public int tienTro() {			
			if(this.sodien > 300)
			return giaphong + this.sodien*giadien + this.sonuoc*gianuoc + phat;
			else return giaphong + this.sodien*giadien + this.sonuoc*gianuoc;
		}
		//tổng số tiền phải nộp của tháng này cảu cả nhà trọ
		public void thuTien(ArrayList<PhongTro> pt) {
			System.out.println("Tiền phòng tháng này");
			for(PhongTro p:pt) {
				System.out.println("Phòng "+p.getPhong()+" : "+p.tienTro()+" VNĐ");
			}
			System.out.println("------------------------------------------------");
		}
		
		
	}

	public class NhanVien{
		private String name;
		private int age;
		private int namkinhnghiem;
		private final int luongcoban = 10000000;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getNamkinhnghiem() {
			return namkinhnghiem;
		}
		public void setNamkinhnghiem(int namkinhnghiem) {
			this.namkinhnghiem = namkinhnghiem;
		}
		public NhanVien(String name, int age, int namkinhnghiem) {
			this.name = name;
			this.age = age;
			this.namkinhnghiem = namkinhnghiem;
		}
		//Lương = Lương cơ bản x (1 +0.3 X số năm kinh nghiệm)
		public int Luong() {
			return  (int)(luongcoban*(1+0.3*this.getNamkinhnghiem()));
		}
		//tính lương cho nhân viên
		public void tinhLuong(ArrayList<NhanVien> nv) {
			 System.out.println("Lương nhân viên: ");
			 for(NhanVien n:nv) {
					System.out.println(n.getName()+" : "+n.Luong()+" VNĐ");
				}
				System.out.println("------------------------------------------------");
		}
		//Xóa nhân viên 
		public void remove(ArrayList<NhanVien> nv,String name) {
			int i=0;
			for( i=0 ; i < nv.size();i++) {
				if(nv.get(i).getName().equals(name))
					break;
			}
			nv.remove(i);
		}
	}
	
	public static void  main(String[] args) {
		Task3 demo = new Task3();
		ArrayList<Student> sinhvien = new ArrayList<>();
		Student sv1 = demo.new Student("Nguyễn Văn Thế","17021038","uet@",3.4);
		Student sv2 = demo.new Student("Hoàng Cao Phi","17021234","hust@",3.5);
		Student sv3 = demo.new Student("Nguyễn Thế Nam","17023333","mta@",3.2);
		Student sv = demo.new Student("Vũ Đức Minh","17026434","ulis@",3.0);
		sinhvien.add(sv1);
		sinhvien.add(sv2);
		sinhvien.add(sv3);
		sinhvien.add(sv);	
		sv.sapXepGPA(sinhvien);	
		sv.totNghiep(sinhvien);
		sv.Search(sinhvien, "Thế");
		
		ArrayList<PhongTro> phongtro = new ArrayList<>();
		PhongTro pt = demo.new PhongTro(101,156,10);
		PhongTro pt1 = demo.new PhongTro(102,356,11);
		PhongTro pt2 = demo.new PhongTro(103,253,10);
		PhongTro pt3 = demo.new PhongTro(104,320,12);	
		PhongTro pt4 = demo.new PhongTro(105,423,16);
		phongtro.add(pt);
		phongtro.add(pt1);
		phongtro.add(pt2);
		phongtro.add(pt3);
		phongtro.add(pt4);
		pt.Phat(phongtro);
		pt.thuTien(phongtro);
		//System.out.println("Tiền trọ phòng "+pt1.getPhong()+" :"+pt1.tienTro());
		
		ArrayList<NhanVien> nhanvien = new ArrayList<>();
		NhanVien nv = demo.new NhanVien("Nguyễn Đức Anh", 25,3);
		NhanVien nv1 = demo.new NhanVien("Trần Thiên Sơn", 29,6);
		NhanVien nv2 = demo.new NhanVien("Trần Đại Nghĩa", 30,5);
		NhanVien nv3 = demo.new NhanVien("Nguyễn Văn Nam", 21,0);
		NhanVien nv4 = demo.new NhanVien("Ngô Xuân Thắng", 33,10);
		nhanvien.add(nv);
		nhanvien.add(nv1);
		nhanvien.add(nv2);
		nhanvien.add(nv3);
		nhanvien.add(nv4);
		nv.tinhLuong(nhanvien);
		nv.remove(nhanvien, "Ngô Xuân Thắng");
		nv.tinhLuong(nhanvien);
	}
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
