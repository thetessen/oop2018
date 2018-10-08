package week3;

import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
	void testmax() {
	Week3 ts1 = new Week3();
		assertEquals(4, ts1.max(2,4));
		assertEquals(5, ts1.max(1,5));
		assertEquals(6, ts1.max(4,6));
		assertEquals(7, ts1.max(7,-1));
		assertEquals(8, ts1.max(8,0));
	}
	
	
    // TODO: Viết 5 testcase cho phương thức minOfArray()
	void testminOfArray() {
		Week3 ts2 = new Week3();	
		int[] a1= {-4};
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
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
	void testcalculateBMI() {
		Week3 ts3 = new Week3();
		assertEquals("Thiếu cân",ts3.calculateBMI(53,1.7));
		assertEquals("Béo phì",ts3.calculateBMI(60,1.45));
		assertEquals("Thừa cân",ts3.calculateBMI(52,1.5));
		assertEquals("Bình thường",ts3.calculateBMI(50,1.5));
		assertEquals("Thừa cân",ts3.calculateBMI(70,1.7));
	}
}
