package testlab8;

public class Tri extends GeometricObject {
    private double s1;
    private double s2;
    private double s3;
    private String color;
    private int weight;

    public Tri(double s1, double s2, double s3, String color, int weight) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.color = color;
        this.weight = weight;
    }
    
    public Tri() {
        color = "White";
    }
        
    public static boolean isTriangle(double s1, double s2, double s3) {
        return  ((s1+s2 > s3)&&(s1+s3 > s2)&&(s3+s2 > s1));
    }
    
    @Override
    public double getArea() {
        double s = (s1 + s2 + s3) / 2.0;
        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
    } 
}
