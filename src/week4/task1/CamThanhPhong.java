
package week4.task1;

/**
 *
 * @author THE TESSEN
 */
public class CamThanhPhong extends Cam{
	private int soluong;
    private int giavon;
	public CamThanhPhong(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan, int soluong, int giavon) {
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
	//Tiền lãi khi bán n kg cam Thanh Phong
	public int Lai(int n) {
		return n*(getGia()-this.giavon);
	}
	public static void main(String[] args) {
		CamThanhPhong camtp= new CamThanhPhong("Hà Giang",20000,26,9,100,16000);
		CamThanhPhong camtp1= new CamThanhPhong("Tuyên Quang",19000,27,9,90,15000);
	}
}
