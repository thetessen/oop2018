
package week4.task2;
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	public static void main(String[] args) {
		Shape shape1 = new Shape();
		Shape shape2 = new Shape("blue",false);
		System.out.println(shape1);
		System.out.println(shape2);
	}
    
}
