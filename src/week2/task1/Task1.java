package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
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
        else return fibonacci(n-1)+fibonacci(n-2);
    }
	public static void main(String[] args) {
    	System.out.println(gcd(4,15));
    	System.out.println(fibonacci(5));
    }
}
