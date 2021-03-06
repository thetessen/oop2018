
package week4.task1;

/**
 *
 * @author THE TESSEN
 */
public class CamSanh extends Cam{
    private int soluong;
    private int giavon;
	public CamSanh(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan, int soluong, int giavon) {
		super(nguon, gia, nhietdobaoquan, thoigianbaoquan);
		this.soluong = soluong;
		this.giavon = giavon;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiavon() {
		return giavon;
	}
	public void setGiavon(int giavon) {
		this.giavon = giavon;
	}
    //Tiền nhập hàng
	public int tienNhap() {
		return this.soluong*this.giavon;
	}
	//Tiền lãi khi bán n kg cam sành
	public int Lai(int n) {
		return n*(getGia()-this.giavon);
	}
	public static void main(String[] args) {
		CamSanh camsanh= new CamSanh("Hà Giang",35000,27,9,100,30000);
		CamSanh camsanh1= new CamSanh("Tuyên Quang",33000,27,9,90,27000);
	}	
}
