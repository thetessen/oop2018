
package week4.task1;

/**
 *
 * @author THE TESSEN
 */
public class HoaQua{
	private String nguon;
	private int gia;
	
	public HoaQua(String nguon, int gia) {
		this.nguon = nguon;
		this.gia = gia;
	}
	public String getNguon() {
		return nguon;
	}
	public void setNguon(String nguon) {
		this.nguon = nguon;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	//Kiểm tra 2 hoa quả có cùng nguồn cung cấp hay không?
	public boolean cungnguonGoc(HoaQua fruit) {
		if(this.nguon.toLowerCase().equals(fruit.getNguon().toLowerCase()))
			return true;
		return false;
	}
	//So sánh giá 2 hoa quả
	public String soGia(HoaQua fruit) {
		if(this.gia > fruit.getGia())	return "Đắt hơn";
			else if(this.gia < fruit.getGia())	return "Rẻ hơn";
				return "Cùng giá";
	}
    
	public static void main(String[] args) {
		HoaQua Dao = new HoaQua("Đồng Tháp",25000);
		HoaQua Nho = new HoaQua("Ninh Thuận",70000);		
	}
}
