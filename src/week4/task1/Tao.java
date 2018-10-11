
package week4.task1;

/**
 *
 * @author THE TESSEN
 */
public class Tao extends HoaQua{
	private String ngaynhap;
	private boolean chin;
	public Tao(String nguon, int gia,String ngaynhap,boolean chin) {
		super(nguon, gia);
		this.ngaynhap = ngaynhap;
		this.chin=chin;
	}
	
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public boolean isChin() {
		return chin;
	}
	public void setChin(boolean chin) {
		this.chin = chin;
	}
	
    //Kiểm tra táo chín chưa
	public void Chin() {
		if(!this.chin)	 System.out.println("Táo vẫn xanh");
			else System.out.println("Táo đã chín");
	}
	//In ngày nhập hàng
	public void ngayNhap() {
		System.out.println(this.ngaynhap);
	}
	public static void main(String[] args) {
		Tao taoPhap = new Tao("Pháp",39000,"07/10/2018",true);
		Tao taoMy = new Tao("Mỹ",44000,"08/10/2018",true);
	}
}
