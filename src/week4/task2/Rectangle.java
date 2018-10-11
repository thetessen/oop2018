
package week4.task2;

public class Rectangle extends Shape{
    private double width;
    private double length;
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
    
	public double getArea() {
		return this.length*this.width;
	}
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length +   
				", Area=" + getArea() + ", Perimeter=" + getPerimeter() + ", Color="
				+ getColor() + ", isFilled=" + isFilled() + "]";
	}

	public static void main(String[] args) {
		Rectangle  rectangle1 = new  Rectangle();
		Rectangle  rectangle2 = new  Rectangle(5.00,2.50);
		Rectangle  rectangle3 = new  Rectangle(3.00,2.00,"green",true);
		System.out.println(rectangle1);
		System.out.println( rectangle2);
		System.out.println( rectangle3);
	}
}
