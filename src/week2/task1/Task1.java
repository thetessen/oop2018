package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
	    a=Math.abs(a);
	    b=Math.abs(b);
		while(a*b !=0){
			if(a>b)	a%=b;
			else b%=a;
		}
        return a+b;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
		if(n==0) return 0;
			else if(n==1) return 1;
        else {
        	int a = 0;
        	int b = 1;
        	int c = 0;
        	for(int i=2 ; i<=n ; i++) {
        		c = a+b;
        		a = b;
        		b = c;
        	}
        	return c;
        }
    }
	public static void main(String[] args) {
    	System.out.println(gcd(4,15));
    	System.out.println(fibonacci(5));
    }
}
