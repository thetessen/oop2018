package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
	private int numerator;
	private int denominator;
	
    public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		if(this.denominator == 0) return "Mẫu số không thể bằng 0";
		else if(this.denominator == 1) return this.numerator+"";
		else if(this.denominator == -1) return (-this.numerator)+"";
		else if(this.denominator < 0 &&this.denominator != -1)
			return (-this.numerator) + "/" + (-this.denominator);
		else return this.numerator + "/" + this.denominator;
	}

	public  int gcd(int a, int b) {
		a=Math.abs(a);
		b=Math.abs(b);
		while(a*b !=0){
			if(a>b)	a%=b;
			else b%=a;
		}
        return a+b;
    }
	public void toiGian() {
		int i = gcd(this.getNumerator(), this.getDenominator());
		this.setNumerator(this.getNumerator() / i);
		this.setDenominator(this.getDenominator() / i);
	}
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
		this.numerator = numerator;
		this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
    this.setNumerator(this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator());
    	this.setDenominator(this.getDenominator() * other.getDenominator()) ;
    	toiGian();
        return  this; 
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        this.setNumerator(this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator());
    	this.setDenominator(this.getDenominator() * other.getDenominator()) ;
    	toiGian();
        return  this; 
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        this.setNumerator( this.getNumerator() * other.getNumerator());
	    	this.setDenominator ( this.getDenominator() * other.getDenominator()) ;
	    	toiGian();
	        return  this;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        this.setNumerator(this.getNumerator() * other.getDenominator());
	    	this.setDenominator( this.getDenominator() * other.getNumerator()) ;
	    	toiGian();
	        return this;
    }
	 public boolean equals(Fraction obj) {
    	if(this.getDenominator()==0 || ((Fraction) obj).getDenominator()==0) {
    		 System.out.println("Mẫu số không thể bằng 0, xin kiểm tra lại");
    	} 		
    	else {
    		toiGian();
        	((Fraction) obj).toiGian();
        	if(this.getNumerator()==((Fraction) obj).getNumerator() && this.getDenominator()==((Fraction) obj).getDenominator())
        		return true;
    	}
		return false;
    	
    }
	public static void main(String[] args) {
		 Fraction a = new  Fraction(7,2);
		 Fraction b = new  Fraction(-4,11);
		 Fraction c = new Fraction(-3,2);
		 Fraction d = new  Fraction(5,8);
		 Fraction e = new  Fraction(7,11);
		 System.out.println(a.add(e));
	   	 System.out.println(b.subtract(e));
	     System.out.println(c.multiply(e));
	     System.out.println(d.divide(e));
		 if(a.equals(b))
    		 	System.out.println("Hai phân số bằng nhau");
    		else System.out.println("Hai phân số không bằng nhau");
	}
}
