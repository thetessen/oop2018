package week7.task1;

public class Numeral extends Expression{
    private int value;

    public Numeral() {
        this.value = 0;
    }

    public Numeral(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return ""+this.value;
    }
  
}
