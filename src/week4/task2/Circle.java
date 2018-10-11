package week4.task2;

public class Circle extends Shape{
    private double radius;
    final private double PI = 3.14;
	public Circle() {
		super();
		this.radius = 1.0;
	}

	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
	public double getArea() {
		return PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return 2*PI*this.radius;
	}

	@Override
	public String toString() {
		return "Circle [Radius=" + getRadius() + ", Area=" + getArea()
				+ ", Perimeter=" + getPerimeter() +", Color="
						+ getColor() + ", isFilled=" + isFilled() + "]";
	}
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2.00,"green",true);
		System.out.println(circle1);
		System.out.println(circle2);
	}
  
}
