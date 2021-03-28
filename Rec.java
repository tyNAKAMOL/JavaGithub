
package testlab8;

public class Rec extends GeometricObject {
    private double d1,d2;
    private String color;
    private int weight;

    public Rec(double d1, double d2, String color, int weight) {
        this.d1 = d1;
        this.d2 = d2;
        this.color = color;
        this.weight = weight;
    }

    public Rec() {
        color = "White";
    }
    
    @Override
    public double getArea() {
        return this.d1 * this.d2;
    }
    
}
