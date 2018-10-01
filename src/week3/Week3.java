package week3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>n)	return m;
        return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=array[0];
    	for(int i=1;i<array.length;i++) {
    		if(array[i] < min)	min = array[i];
    	}
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double bmi = weight/(height*height);
    	if(bmi < 18.5)	return "Thiếu cân";
    		else if(bmi < 22.99) return "Bình thường";
    			else if(bmi < 24.99) return "Thừa cân";
    				else  return "Béo phì";
    }
}
class Week3Test {

	@Test
	void testmax() {
	Week3 ts1 = new Week3();
		assertEquals(4, ts1.max(2,4));
		assertEquals(5, ts1.max(1,5));
		assertEquals(6, ts1.max(4,6));
		assertEquals(7, ts1.max(7,-1));
		assertEquals(8, ts1.max(8,0));
	}
	void testminOfArray() {
		Week3 ts2 = new Week3();	
		int[] a1= {1,3,7,-4,8};
		int[] a2= {5,6,3,-1,2,9};
		int[] a3= {6,3,7,4,-8,9,10};
		int[] a4= {-1,13,9,-4,8,-66,7};
		int[] a5= {11,23,7,5,8,15,16,17};
		assertEquals(-4,ts2.minOfArray(a1));
		assertEquals(-1,ts2.minOfArray(a2));
		assertEquals(-8,ts2.minOfArray(a3));
		assertEquals(-66,ts2.minOfArray(a4));
		assertEquals(5,ts2.minOfArray(a5));
		
	}
	void testcalculateBMI() {
		Week3 ts3 = new Week3();
		assertEquals("Thiếu cân",ts3.calculateBMI(53,1.7));
		assertEquals("Béo phì",ts3.calculateBMI(60,1.45));
		assertEquals("Thừa cân",ts3.calculateBMI(52,1.5));
		assertEquals("Bình thường",ts3.calculateBMI(50,1.5));
		assertEquals("Thừa cân",ts3.calculateBMI(70,1.7));
	}	
}
