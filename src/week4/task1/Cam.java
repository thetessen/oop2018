
package week4.task1;

/**
 *
 * @author THE TESSEN
 */
public class Cam extends HoaQua{
    private double nhietdobaoquan;
    private double thoigianbaoquan;
	
	public Cam(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan) {
		super(nguon, gia);
		this.nhietdobaoquan = nhietdobaoquan;
		this.thoigianbaoquan = thoigianbaoquan;
	}

	public double getNhietdobaoquan() {
		return nhietdobaoquan;
	}
	public void setNhietdobaoquan(double nhietdobaoquan) {
		this.nhietdobaoquan = nhietdobaoquan;
	}
	public double getThoigianbaoquan() {
		return thoigianbaoquan;
	}
	public void setThoigianbaoquan(double thoigianbaoquan) {
		this.thoigianbaoquan = thoigianbaoquan;
	}
    //Kiểm tra cam có thể để được trong n ngày hay ko
	public void hanbaoQuan(double num) {
		if(num <= this.thoigianbaoquan) System.out.println("Có thể bảo quản");
		else System.out.println("Quá thời hạn không thể bảo quản");
	}
	//Kiểm tra cam có thể được bảo quả ở nhiệt đọ t không
	public void nhietdobaoQuan(double t) {
		if(t<this.nhietdobaoquan && t> this.nhietdobaoquan-4)
			 System.out.println("Có thể bảo quản");
		else System.out.println("Nhiệt độ không thích hợp để bảo quản");
	}
	public static void main(String[] args) {
		Cam camcanh = new Cam("Bắc Giang",80000,27,9);
		Cam camkhe = new Cam("Hà Tĩnh",65000,27,8);
	}
}
